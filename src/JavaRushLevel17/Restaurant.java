package JavaRushLevel17;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/*1.Разберись, что делает программа. Официант почему-то не относит приготовленные блюда назад к столам :(

2.Исправь ошибку.

Подсказка: это одна строчка*/
public class Restaurant {
    public static List<Thread> threads = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Waiter waiterTarget = new Waiter();
        Thread waiter = new Thread(waiterTarget);
        threads.add(waiter);

        Cook cookTarget = new Cook();
        Thread cook = new Thread(cookTarget);
        threads.add(cook);

        waiter.start();
        cook.start();



        Thread.sleep(2000);
        cookTarget.continueWorking = false;
        Thread.sleep(500);
        waiterTarget.continueWorking = false;
    }
}

 class Dishes {
    private byte tableNumber;

    public Dishes(byte tableNumber) {
        this.tableNumber = tableNumber;
    }

    public byte getTableNumber() {
        return tableNumber;
    }
}
 class Table {
    private static byte tableNumber;
    private byte number = ++tableNumber;

    public Order getOrder() {
        return new Order(number);
    }
}

 class Order {
    private long time;
    private byte tableNumber;

    public Order(byte tableNumber) {
        time = (long) (Math.random() * 200);
        this.tableNumber = tableNumber;
    }

    public long getTime() {
        return time;
    }

    public byte getTableNumber() {
        return tableNumber;
    }
}

class Waiter implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        Manager manager = Manager.getInstance();

        while (continueWorking || !manager.getDishesQueue().isEmpty()) {
            if (!manager.getDishesQueue().isEmpty()) {       //относим готовый заказ
                Dishes dishes = manager.getDishesQueue().poll();
                System.out.println("Официант отнес заказ для стола №" + dishes.getTableNumber());
            } else {                                         //берем новый заказ
                Table table = manager.getNextTable();
                Order order = table.getOrder();
                System.out.println("Получен заказ от стола №" + order.getTableNumber());
                manager.getOrderQueue().add(order);
            }
            try {
                Thread.sleep(100);  //walking to the next table
            } catch (InterruptedException e) {
            }
        }
    }
}

class Manager {      //singleton
    private static Manager ourInstance = new Manager();

    private final List<Table> restaurantTables = new ArrayList<Table>(10);//создает список и столов
    private int currentIndex = 0;

    private final Queue<Order> orderQueue = new ConcurrentLinkedQueue<Order>();        // очередь с заказами
    private final Queue<Dishes> dishesQueue = new ConcurrentLinkedQueue<Dishes>();     // очередь с готовыми блюдами

    public synchronized static Manager getInstance() { //синглтон, если менеджера нет создает его, если есть -вовзращает существующий
        return ourInstance;
    }

    private Manager() {               // создаем 10 столов, добавляем в списк столов
        for (int i = 0; i < 10; i++) {
            restaurantTables.add(new Table());
        }
    }

    public synchronized Table getNextTable() {           // официант ходит по кругу от 1 стола к 10
        Table table = restaurantTables.get(currentIndex);
        currentIndex = (currentIndex + 1) % 10;//остаток от деления-номер стола
        return table;
    }

    public Queue<Order> getOrderQueue() {
        return orderQueue;
    }

    public Queue<Dishes> getDishesQueue() {
        return dishesQueue;
    }
}

class Cook implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        boolean needToWait;
        while (continueWorking || needToCookOrders()) {
            try {
                synchronized (this) {
                    needToWait = !needToCookOrders();//нужно ли ждать если очередь полная ? -да нужно
                    if (!needToWait) {//если не нужно ждать, повар начинает готовить
                        cook();
                    }
                }
                if (continueWorking && needToWait) {//если не нужно ждать и очередь пуста то повар отдыхает
                    System.out.println("Повар отдыхает");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    private boolean needToCookOrders() { //метод, нужно ли готовить?
        return !Manager.getInstance().getOrderQueue().isEmpty();//если очередь не пустая -нужно готовить
    }

    private void cook() throws InterruptedException {
        Manager manager = Manager.getInstance();
        Order order = manager.getOrderQueue().poll();      // повар берет заказ из очереди, с последующим его удалением
        System.out.println(String.format("Заказ будет готовиться %d мс для стола №%d", order.getTime(), order.getTableNumber()));
        Thread.sleep(order.getTime());     // готовим блюдо
        Dishes dishes = new Dishes(order.getTableNumber());       //  это готовое блюдо
        System.out.println(String.format("Заказ для стола №%d готов", dishes.getTableNumber()));
        manager.getDishesQueue().add(dishes);
    }
}