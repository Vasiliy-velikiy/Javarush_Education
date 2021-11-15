package JavaRushLevel21;

import java.util.Date;
import java.util.Objects;

/*Исправьте ошибки реализаций методов equals и hashCode для класса Solution.*/
public class CorrectMistakes3 {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private CorrectMistakes3 solution;

    public CorrectMistakes3(int anInt, String string, double aDouble, Date date, CorrectMistakes3 solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o==null||getClass()!=o.getClass())return  false;
       // if (!(o instanceof Solution)) return false;//ругался на это но можно было еще строчкой внизу дописать в добавок
        // if(o==null)return false; //тоже бы прошло

        CorrectMistakes3 solution1 = (CorrectMistakes3) o;
//начинает сравнивать поля по порядку, если первые поля у сравниваемых объектов равны-переходит к сравнению других полей , если нет-то выкидывает false-значит не равны
        if (Double.compare(solution1.aDouble, aDouble) != 0) return false;
        if (anInt != solution1.anInt) return false;
        if (date != null ? !date.equals(solution1.date) : solution1.date != null) return false;
        if (solution != null ? !solution.equals(solution1.solution) : solution1.solution != null) return false;
         if (string != null ? !string.equals(solution1.string) : solution1.string != null) return false;



        return true;
    }

    @Override
    public int hashCode() {
/*
        int result;
        long temp;
        result = anInt;
        temp = aDouble != +0.0d ? Double.doubleToLongBits(aDouble) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (solution != null ? solution.hashCode() : 0);
        return result;


 */

        //можно и так

        return Objects.hash(anInt,string,aDouble,date,solution);
    }

    public static void main(String[] args) {

    }
}
