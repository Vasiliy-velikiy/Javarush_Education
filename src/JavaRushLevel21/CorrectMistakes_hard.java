package JavaRushLevel21;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*В классе Solution исправить пару методов equals/hashCode в соответствии с правилами реализации этих
методов(детали уточни у своего любимого поисковика).
Обе строки first и last должны принимать участие в сравнении с помощью метода equals и вычислении hashcode.
Метод main не участвует в тестировании.

CorrectHashandEqualsmethod*/


public class CorrectMistakes_hard {
    private final String first, last;

    public CorrectMistakes_hard(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {

        if(o==null)return false;

        if (o == this)return true;
        if (!(o instanceof CorrectMistakes_hard))return false;

        CorrectMistakes_hard n=(CorrectMistakes_hard)o;


        if (first!=null&&first.equals(n.first)&&last!=null&&last.equals(n.last)) return true;//
        if(first!=null&&first.equals(n.first)&&last==null&&n.last==null)return true;
        if(last!=null&&last.equals(n.last)&&first==null&&n.first==null)return true;
        if (n.first==null&&this.first==null&&n.last==null&&this.last==null)return true;
        else return  false;


        /* не доработанное решение
        if (n.first==null&&this.first==null&&n.last==null&&this.last==null)return true;//если объекты созданы но поля не проинициализированы -то объекты равны
        else if (n.first==null&&this.first==null&&n.last.equals(this.last)) return true;//если первое поле у обьектов не проинизиализировано а второе равно-то объекты равны
        else if (n.last==null&&this.last==null&&n.first.equals(this.first)) return true;//если второе поле не проинициализировано а первое поле одинаково-то объекты равны
        else if (first.equals(n.first) && last.equals(n.last)) return true;//если объекты созданы и поля(проинициализированы) и одинаковые- то объекты равны
        else if(this.last==null&&n.last!=null) return false;
        else if(this.first==null&&n.first!=null) return false;


        else return false;


         */
        //правильное решение
        /*
        if (this.first!=null?!this.first.equals(n.first):n.first!=null)return false;//если у текущего объекта поле не пустое- то сравниваются первые поля - и если они не подходят то возвращается false -в если же подходят то переходим на строчку ниже
        return this.last!=null?this.last.equals(n.last):n.last==null;//если второе поле объектов равно то возвращаем true


         */
    }

    public int hashCode() {

        return Objects.hash(first,last);
        //Это можно написать как
        /*
        if (first==null&&last==null) return 0;
        if(first==null)return last.hashCode();
        if(last==null)return first.hashCode();
        else return last.hashCode()+first.hashCode();


         */
    }

    public static void main(String[] args) {
        Set<CorrectMistakes_hard> s = new HashSet<>();
        s.add(new CorrectMistakes_hard("Donald", "Duck"));
        System.out.println(s.contains(new CorrectMistakes_hard("Donald", "Duck")));
    }
}