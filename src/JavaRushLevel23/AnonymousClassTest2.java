package JavaRushLevel23;
/*Метод printName должен выводить имя собственного объекта, т.е. "The Darkside Hacker"
Сделайте минимум изменений.*/
public class AnonymousClassTest2 {
    private String name;

    AnonymousClassTest2(String name) {
        this.name = name;
    }

    public String getName() {//здесь был приватный модификатор
        return name;
    }
/*Когда у тебя стоит public, то анонимный класс, который создается в sout(), наследует метод getName(),
и при вызове этот метод возвращает значение поля name из этого анонимного класса.
А если ты меняешь на private, то анонимный класс его не наследует, и при вызове getName() будет срабатывать
"родительский" метод (из самого Solution, а не из его анонимного наследника), а у родителя другое значение поля name - поэтому
 и вывод будет другой*/
    private void sout() {
// Solution solution=
       new AnonymousClassTest2("The Darkside Hacker") {//внутри анонимного класса-наследник класса Solution
            void printName() {
                System.out.println(getName());//чтобы выводился "The Darkside Hacker" нужно изменть модификатор доступа у  String getName()
            }
        }.printName();

    }

    public static void main(String[] args) {
        new AnonymousClassTest2("Риша").sout();
    }
}