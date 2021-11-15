package JavaRushLevel14;

import java.util.ArrayList;
import java.util.List;

/*Расширь функциональность программы, которая позволит производить манипуляции с валютами.
В абстрактном классе Money создай приватное поле amount типа double.
Создай публичный геттер для поля amount(public double getAmount()), чтобы к этому полю можно было получить доступ извне класса Money.
В отдельных файлах создай классы Hryvnia, Ruble и USD, которые будут являться потомками класса Money.
В классах Hryvnia, Ruble и USD реализуй метод getCurrencyName() который будет возвращать название соответствующей валюты (строку) в виде аббревиатуры (USD, UAH, RUB).
В классах Hryvnia, Ruble и USD реализуй публичный (public) конструктор, который принимает один параметр и вызывает конструктор базового класса (super) с этим параметром.
Заполни список allMoney объектами всех возможных в рамках условия задачи и функциональности программы валют.*/
public class ManipylationWithMoney_hard {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;
        private List<Money> allMoney;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            allMoney.add(new Ruble(100));
            allMoney.add(new USD(200));
            allMoney.add(new Hryvnia(50));
            //напишите тут ваш код
        }



        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}

class USD extends Money{
    @Override
    public String getCurrencyName() {
        return "USD";
    }

    public USD(double amount) {
        super(amount);
    }

}
class Ruble extends Money {
    @Override
    public String getCurrencyName() {
        return "RUB";
    }

    public Ruble(double amount) {
        super(amount);
    }


}
class Hryvnia extends  Money{
    @Override
    public String getCurrencyName() {
        return "UAH";
    }



    public Hryvnia(double amount) {
        super(amount);
    }
}
 abstract class Money {
    private double amount;
    public Money(double amount) {
        this.amount=amount;
    }


    public double getAmount(){
        return amount;
    }


    public abstract String getCurrencyName();
}
