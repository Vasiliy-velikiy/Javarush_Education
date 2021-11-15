package JavaRushLevel24;

import java.math.BigDecimal;

/*Внутри класса Solution создай 2 внутренних public класса Apt3Bedroom, BigHall.
Унаследуй их от Apartments и Hall.*/
public class InnerClassTest {
    public class Building {
        public class Hall {
            private BigDecimal square;

            public Hall(BigDecimal square) {
                this.square = square;
            }
        }

        public class Apartments {
        }
    }

    //Когда мы создаём класс Apt3Bedroom - нам необходимо инициализировать поля предка Apartments,
    // для этого вызывается его конструктор через super();
    public class Apt3Bedroom extends Building.Apartments {//наш предок  Apartments вложен в Building при этом он не статичный
                                                         //значит для создания Apartments нам нужна ссылка на внешний объект Building

       /* Apt3Bedroom(Building building){ //в данном случае нам ссылку передают в параметрах конструтора
            building.super();
        }*/
       Apt3Bedroom(){  //здесь мы создаем сами
           new Building().super();
       }

    }
    public class BigHall extends Building.Hall {

        BigHall(Building building,BigDecimal square){
            building.super(square);
        }

    }

    public static void main(String[] args) {

    }
}
