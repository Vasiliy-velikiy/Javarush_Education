package JavaRushLevel5;
/*Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касается возраста и цвета.
А вот имени может и не быть (null).
То же касается адреса: null.*/



/*Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)

Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.*/
public class Cat {

String name=null;
String address=null;
int weight;
int age;//возраст тоже должен быть средний у кошки в противном случае задача на javarush не пройдет по критериям
int weight_standard=4;
String color=null;//у кошки должен быть цвет
String colormd="sred";


public Cat(String name) {
    this.name=name;
    weight=weight_standard;
    age= weight_standard;
    color=colormd;

}
public Cat(String name,int weight,int age) {
        this.name=name;
        this.weight=weight;
        this.age=age;
        color=colormd;



    }
    public Cat(String name,int age) {
        this.name=name;
        weight=weight_standard;
        this.age=age;
        color=null;

}
public Cat(int weight, String color) {
    this.weight=weight;
    this.color=color;
    age=weight_standard;


}
public Cat(int weight, String color, String address) {
    this.weight=weight;
    this.address=address;
age=weight_standard;
    this.color=color;


}














    public void initialize(String name){
        this.name=name;
        weight=weight_standard;
        age= weight_standard;
color=colormd;

}
    public void initialize(String name,int weight,int age){
        this.name=name;
        this.weight=weight;
        this.age=age;
color=colormd;

}
    public void initialize(String name,int age){
        this.name=name;
       weight=weight_standard;
        this.age=age;
        color=null;


}
    public void initialize(int weight, String color){
        this.weight=weight;
        this.color=color;

}


public void initialize(int weight, String color, String address){
        this.weight=weight;
        this.address=address;

        this.color=color;
}







    public static void main(String[] args) {

    }
}
