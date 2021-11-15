package JavaRushLevel22.Game_Snake;
//1
    /*А теперь напишем игру "змейка".

Для этого нам понадобятся:
а) собственно сама змея (класс Snake)
б) комната, в которой она будет ползать (класс Room)
в) мыши, которых она будет есть (класс Mouse)

Создай классы Snake, Room, Mouse

Не забудь создать метод public static void main(String[] args) в классе Room.*/
//2
    /*Теперь самое интересное - как будет устроена змея.

Что можно сказать о змее:
а) По сути - змея это набор кусочков - клеточек. Но точно известно, что один из них - голова.
б) У змеи есть направление движения.

Так что нам еще понадобятся классы:
SnakeSection - кусочек змеи.
SnakeDirection - класс (enum) будет описывать направление движения змеи.

Создай классы SnakeSection и SnakeDirection. */
//3
    /*Отлично. Я еще добавил класс KeyboardObserver на будущее.
Изучи его внимательно. Пригодится.

Начнем с самого простого - класса Mouse.
Мышь не будет двигаться и у нее будут только координаты и все.
Добавь два приватных поля в класс Mouse: x и y типа int.*/
//4
    /*Координаты x и y ты уже создал в классе Mouse, а как получить к ним доступ?
Создай корректные геттеры для этих полей и конструктор с двумя параметрами типа int (x и y соответственно)*/
//5
    /*Теперь доделаем enum SnakeDirection так, чтобы он содержал возможные направления движения змейки.

Добавь 4 значения UP, DOWN, LEFT, RIGHT.

Должно получиться примерно так:
public enum SnakeDirection
{
 UP,
 RIGHT,
 DOWN,
 LEFT
}*/
//6
    /*Теперь займемся классом SnakeSection.
Он будет описывать один кусочек змеи.

А у каждого кусочка что есть?
Правильно! Координаты.

Добавь два поля в класс SnakeSection: x и y типа int.
Добавь для них getter'ы и конструктор с двумя параметрами типа int*/
//7
    /*"Кусочки змеи" мы описали, теперь займемся самой змеей.

У змеи должен быть список кусочков (SnakeSection) и голова.
Пусть головой будет просто самый первый кусочек (с номером 0).

У змеи также есть направление движения - сторона, куда она движется по умолчанию.
А еще есть состояние - жива змея или мертва.
Игра заканчивается тогда, когда змея мертва.

Надо:
а) Добавить в класс Snake поле sections типа List<SnakeSection>.
б) Добавить поле isAlive типа boolean.
в) Добавить поле direction типа SnakeDirection.
г) Для всех полей добавить getter'ы, а для direction еще и setter.

Примечание:
Для полей логического типа геттер принято писать не как getValue(), а как isValue() - это улучшает читабельность кода.
Только не пиши isIsAlive(). Одного is будет вполне достаточно.

Примечание 2:
Все поля создаваемые в этом задании должны быть приватными, а методы - публичными*/
//8
    /*Настала очередь конструктора класса Snake.

Змея у нас будет поначалу состоять из одного кусочка - головы.
А что для него требуется?
Что необходимо передать в конструктор?
Координаты змеи, конечно же.

Надо:
а) Передать в конструктор координаты головы змеи (x и y).
б) создать в нем первый "кусочек змеи" (голову) и добавить его в коллекцию sections (ArrayList).
в) isAlive выставить в true.
г) не забудь в конструкторе инициализировать переменную sections. В null не много-то и добавишь!
д) создать и реализовать метод int getX(). Метод должен вернуть координату Х головы змеи.
е) создать и реализовать метод int getY(). Метод должен вернуть координату Y головы змеи.
ж) еще добавить классу метод move()- он нам пригодится попозже.
з) созданный конструктор должен быть публичным.*/
//9
    /*Еще остался самый главный класс - Room.
Что нам нужно для его описания?
Размеры комнаты (width и height) - раз.
Змея - два
Мышь - три.

Надо:
а) создать в классе Room переменные width и height типа int.
б) создать в классе Room переменную snake типа Snake.
в) создать в классе Room переменную mouse типа Snake. Шучу. Типа Mouse, конечно же :).
г) создать для них всех геттеры и сеттеры.
д) создать конструктор. Конструктор должен принимать три параметра: width, height и ... snake!*/
//10
    /*Займемся методом main.

Для начала надо создать в классе Room статическое поле game типа Room. Доступ к переменной должен быть из всех классов.

Затем в методе main:
а) Создать змею - объект типа Snake.
б) Создать комнату - объект типа Room и передать в него ширину, высоту и змею.
в) Установить змее direction равным SnakeDirection.DOWN

Чего еще не хватает? Собственно метода, в котором будет идти вся игровая логика.
И еще нужен метод, который бы отрисовывал все это на экране:
а) создать метод void run()
б) создать метод void print()*/
//11
    /*Теперь логика управления мышью.

С мышью у нас будут происходить две вещи.
Первая - змея съедает мышь.
Вторая - появляется новая мышь в случайной точке комнаты.
Надо написать и реализовать метод createMouse() в классе Room.
В этом методе мы просто должны создавать новую мышь со случайными координатами в комнате.
Как получить случайные координаты?

Это ты уже должен был знать. На всякий случай даю подсказку:
int x = (int) (Math.random() * width);
Еще понадобится метод - eatMouse(), на случай, если мышь все-таки кто-то съест :)

Пока сложной логики в этом методе не будет - просто будем вызывать метод createMouse и все.*/
//12
    /*Змея у нас есть, пусть и мышь будет.

Добавить в метод main:
a) вызов метода createMouse().
б) вызов метода run().
Без него ничего работать не будет. В нем вся основная логика.
Неплохо получилось, но я все-таки внесу пару правок.
Кстати, как насчет написать метод sleep?
Ты уже понял из предыдущих задач, что в методе run нужна пауза.
Но насколько я помню, скорость в змейке должна расти при росте ее длины.
Значит чем длиннее змея, тем выше скорость и меньше пауза.*/
//13
    /*Предлагаю тебе в этот раз написать специальный метод sleep(), который будет делать паузу в зависимости от длины змеи (количества элементов в sections).
Придумай какой-нибудь хитрый алгоритм. Чтобы на первом уровне пауза была 500 миллисекунд, к 11 уровню постепенно уменьшилась до 300.
А к 15 до 200. И дальше оставалась постоянной.*/
//14
    /*Теперь поработаем над методом print().

Надо:
а) вывести на экран прямоугольник из точек размером width x height.
б) тело змеи отметить символом "x"-английское
в) голову змеи нарисовать символом "X"-английское.

Подсказка:
а) удобно сначала создать матрицу типа int[][] с размером (height x width)
б) затем пройтись по всем объектам и отрисовать их в матрицу.
Например, тело змеи - 1, голова змеи - 2, мышь - 3.*/
//15
    /*Теперь осталось допилить змею.

Вот что я предлагаю насчет движения змеи:
Змея состоит из кусочков. Давай каждый ход просто добавлять один кусочек со стороны головы, а самый последний - удалять.
Тогда получится, что змея ползет.

Давай добавим два метода move, один без параметров, а другой с двумя параметрами типа int.

В методе move без параметров необходимо:
а) прекратить движение если змея умерла (isAlive == false)
б) вызвать метод move(0, -1) если направление движения равно SnakeDirection.UP
в) вызвать метод move(1, 0) если направление движения равно SnakeDirection.RIGHT
г) вызвать метод move(0, 1) если направление движения равно SnakeDirection.DOWN
д) вызвать метод move(-1, 0) если направление движения равно SnakeDirection.LEFT

Метод move с параметрами int, int пока оставим пустым.*/
//16
    /*Ничто не вечно. Так и змея должна умирать, если она врезается в стену или саму себя.

Для определения, не пересекается ли змея сама с собой, можно сделать очень простую проверку:
содержит ли список sections "новую голову змеи".

Код для этого будет выглядеть примерно так:
if (sections.contains(head))

При этом head должен быть еще не добавлен в список sections, иначе будет всегда true.
Но чтобы этот код работал, надо реализовать методы сравнения объектов (equals и hashCode) в классе SnakeSection.

Подсказка:
Используй Ctrl+O в Intellij IDEA для автоматической генерации методов equals и hashCode.

Задание:
а) реализуй методы equals и hashCode в классе SnakeSection.
б) реализуй метод checkBorders(SnakeSection head): если голова змеи за границами комнаты - змея умирает (isAlive = false)
в) реализуй метод checkBody(SnakeSection head): если голова змеи пересекается с ее телом - змея умирает (isAlive = false)*/
//17
    /*Теперь закончим класс Snake.

Змея состоит из кусочков. Давай каждый ход просто добавлять один кусочек со стороны головы, а самый последний - удалять. Тогда получится, что змея ползет.
Добавлять кусочек нужно рядом с текущей головой (кусочком номер 0).
С какой стороны добавлять зависит от direction (UP, DOWN, LEFT, RIGHT).

Подсказка:
а) Как добавить кусочек змеи в начало списка sections?
sections.add(0, new_section);
б) А как удалить последний?
sections.remove(sections.size()-1);

Необходимо реализовать метод move(int dx, int dy):
а) проверить, не вылезла ли она за границу комнаты (если да, то змея умирает)
б) проверить, не совпадает ли она с уже существующими кусочками змеи (если да, то змея умирает)
в) добавить голову к змее (со стороны головы) и удалить последний кусочек из хвоста.
г) вызвать метод eatMouse у статического объекта game класса Room, если координаты мыши совпадают с координатами головы змеи.
д) если змея поймала мышь (координаты головы совпадают с координатами мыши), то удалять кусок из хвоста не надо.*/
//18
    /*запускаем игру*/


///!!! для варианта с GUI
/*Для тех кто, как и я думал что решение данной задачи будет графическим, а не консольным:
Я сделал минимальные, как мне кажется исправления, у же имеющегося решения

В классе KeyboardObserver делаем следующие исправления:
1. private JFrame frame; меняем на: static JFrame frame; чтобы меньше делать исправлений;
2. frame.setSize(400, 400); задаем новые размеры окна frame.setSize((Room.game.getWidth() * 10) + 17, (Room.game.getHeight() * 10) + 40); это с учетом толщены рамок окна
3. frame.setExtendedState(JFrame.MAXIMIZED_BOTH); убираем разворот окна: //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
4. frame.setUndecorated(true); меняем на: frame.setUndecorated(false); чтобы у окна появилась рамка;
5. frame.setOpacity(0.0f); закомментарим эту строку //frame.setOpacity(0.0f); чтобы убрать прозрачность;
6. frame.setVisible(true); закомментарим и эту строку //frame.setVisible(true); отобразим окно в другом месте;

Далее добавляем новый класс, это класс отвечает за добавление графических элементов в окно программы:
public class Layer extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(java.awt.Color.GREEN); //Задаем цвет элементов зеленый
        g.fillRect(Room.game.getWidth() * 10, 0, 10, (Room.game.getWidth() * 10) + 10);  //Рисуем прямоугольник показывающий край поля справа
        g.fillRect(0, Room.game.getHeight() * 10, (Room.game.getHeight() * 10) + 10, 10); //Рисуем прямоугольник показывающий край поля снизу

        g.fillRect(Room.game.getMouse().getX()*10, Room.game.getMouse().getY()*10, 10, 10); //Рисуем прямоугольник показывающий мышь

        List<SnakeSection> getsection = Room.game.getSnake().getSections(); //Получаем секции змейки
        for (int i = 0; i < getsection.size(); i++) {
            g.fillRect(getsection.get(i).getX()*10, getsection.get(i).getY()*10, 10, 10); //Рисуем по очереди секции змейки
        }
    }

}
нужно в классе Room заменить метод paint на следующий

public void print() {
     if (KeyboardObserver.frame != null) {
         KeyboardObserver.frame.setContentPane(new Layer());
         KeyboardObserver.frame.setVisible(true);
     }
 }


*/
import java.awt.event.KeyEvent;

public class Room {
    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public static Room game;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
        game = this;
    }

    public Snake getSnake() {
        return snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     * Основной цикл программы.
     * Тут происходят все важные действия
     */
    public void run() throws InterruptedException {
        //Создаем объект "наблюдатель за клавиатурой" и стартуем его.
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        //пока змея жива
        while (snake.isAlive()) {
            //"наблюдатель" содержит события о нажатии клавиш?
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                //Если равно символу 'q' - выйти из игры.
                if (event.getKeyChar() == 'q') return;

                //Если "стрелка влево" - сдвинуть фигурку влево
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    snake.setDirection(SnakeDirection.LEFT);
                    //Если "стрелка вправо" - сдвинуть фигурку вправо
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    snake.setDirection(SnakeDirection.RIGHT);
                    //Если "стрелка вверх" - сдвинуть фигурку вверх
                else if (event.getKeyCode() == KeyEvent.VK_UP)
                    snake.setDirection(SnakeDirection.UP);
                    //Если "стрелка вниз" - сдвинуть фигурку вниз
                else if (event.getKeyCode() == KeyEvent.VK_DOWN)
                    snake.setDirection(SnakeDirection.DOWN);
            }

            snake.move();   //двигаем змею
            print();        //отображаем текущее состояние игры
            sleep();        //пауза между ходами
        }

        System.out.println("Game Over!");
    }
//заменяем метод


    public void print() {
        if (KeyboardObserver.frame != null) {
            KeyboardObserver.frame.setContentPane(new Layer());
            KeyboardObserver.frame.setVisible(true);
        }
    }

    /*public void print() {


        int[][] array = new int[height][width]; //Создаем массив, куда будем "рисовать" текущее состояние игры
//кстати обозначения частей тела не по условию(так было в примере
        array[snake.getSections().get(0).getY()][snake.getSections().get(0).getX()] = 1;//присваиваем местоположение секции-голова
        for (int q = 1; q < snake.getSections().size(); q++) {
            array[snake.getSections().get(q).getY()][snake.getSections().get(q).getX()] = 3;//присваиваем тело
        }
        array[mouse.getY()][mouse.getX()] = 2;//присваиваем мышь

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                if (array[i][j] == 0) {
                    System.out.print(".");//если место пустое то отрисовываем точку
                } else if (array[i][j] == 1) {//если нашли голову то отрисовываем ее
                    System.out.print("X");
                } else if (array[i][j] == 2)//если нашли мышь то отриосываем
                    System.out.print("^");
                else if (array[i][j] == 3) {//если нашли тело-то отриосываем
                    System.out.print("x");
                }
            System.out.println("");

        }
        //Рисуем все кусочки змеи
        //Рисуем мышь
        //Выводим все это на экран
    }
    */


    public void eatMouse() {
        createMouse();
    }

    public void createMouse() {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);

        mouse = new Mouse(x, y);
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Room(20, 20, new Snake(10, 10));
        game.snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.run();
    }

    public void sleep() throws InterruptedException {
        if(snake.getSections().size()>15){
            Thread.sleep(200);
        }
        else {
            Thread.sleep(520-snake.getSections().size()*20);
        }

    }
}




