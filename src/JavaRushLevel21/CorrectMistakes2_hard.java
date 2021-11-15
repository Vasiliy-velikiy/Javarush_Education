package JavaRushLevel21;

import java.util.HashSet;
import java.util.Set;

public class CorrectMistakes2_hard {


    private final String first, last;

    public CorrectMistakes2_hard(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (!(o instanceof CorrectMistakes2_hard))  return false;
        if(o==null)return false;
        if (o == this)return true;

        CorrectMistakes2_hard n = (CorrectMistakes2_hard) o;
/*
        if (n.first==null&&this.first==null&&n.last==null&&this.last==null)return true;//если объекты созданы но поля не проинициализированы -то объекты равны
        else if (n.first==null&&this.first==null&&n.last.equals(this.last)) return true;//если первое поле у обьектов не проинизиализировано а второе равно-то объекты равны
        else if (n.last==null&&this.last==null&&n.first.equals(this.first)) return true;//если второе поле не проинициализировано а первое поле одинаково-то объекты равны
        else if (first.equals(n.first) && last.equals(n.last)) return true;//если объекты созданы и поля(проинициализированы) и одинаковые- то объекты равны
        else return false;

 */

        /*
                        //непонятно здесь--если first.equals(n.first) возвращает true и стоит знак ! то мы меняем его на false-если данное выражение возратит false-то обьекты не равны и ко 2 строчке сравнение не перейдет
        if(first!=null?!first.equals(n.first):n.first!=null  ) return false;//если у объекта 1 поле не пустое, и сравнение 1строки с объектом n возвращает false(т.е они не равны) возвращается false
                                                                           //или же если 1поле у объекта пустое  а у объекта n оно не пустое-то все равно возвращается false если 1поле у объекта n пустое -то переходит ко 2 строчке сравнения
                                                             //если верхние условия не выполняются то переходим к этой строчке

        return(last!=null?last.equals(n.last):last==null);

         */
        if (first!=null&&first.equals(n.first)&&last!=null&&last.equals(n.last)) return true;//
        if(first!=null&&first.equals(n.first)&&last==null&&n.last==null)return true;
        if(last!=null&&last.equals(n.last)&&first==null&&n.first==null)return true;
        if (n.first==null&&this.first==null&&n.last==null&&this.last==null)return true;
        else return  false;


    }

    @Override
    public int hashCode() {

        //return   Objects.hash(first,last);

        //Это можно написать как

        if (first==null&&last==null) return 0;
        if(first==null)return last.hashCode();
        if(last==null)return first.hashCode();
        else return last.hashCode()+first.hashCode();



    }

    public static void main(String[] args) {
        Set<CorrectMistakes2_hard> s = new HashSet<>();
        s.add(new CorrectMistakes2_hard("Mickey", "Mouse"));
        System.out.println(s.contains(new CorrectMistakes2_hard("Mickey", "Mouse")));
    }
}
