package JavaRushLevel21;
/*Упростить. Переменные не переименовывать, комментарии не оставлять.*/
public class Simplify_logicoperation_hard {
    public static boolean calculate(boolean a, boolean b, boolean c, boolean d) {

        //было      return (a && b && c && !d) || (!a && c) || (!b && c) || (c && d);
        return c&&true; //после приведения у нас остается (что то*1) =что то
    }

    public static void main(String[] args) {
        System.out.println(calculate (true,true,true, true));
        System.out.println(calculate (true,true,true, false));

        System.out.println(calculate (true,true,false, false));
        System.out.println(calculate (true,true,false, true));

        System.out.println(calculate (true,false,false, true));
        System.out.println(calculate (true,false,true, true));
        System.out.println(calculate (false,false,false, true));
        System.out.println(calculate (true,false,true, false));

        System.out.println(calculate (false,true,false, true));
        System.out.println(calculate (true,false,true, true));
    }

}
//2способ решения

/*
return (a && b && c && !d) || (!a && c) || (!b && c) || (c && d);


(a && b && c && !d) можно все заменить на не d (!d)   //-потому что вывод будет зависеть от значения !d
(!a && c) заменим( b && d && c ) можно все заменить на не a (!a)  //тоже самое как и строчкой выше
 (!b && c) заменим ( a && d && c ) можно все заменить на не b (!b)
 (c && d);заменим (c и d)
получили

!d или !a или !b или (с и d)
то есть return не принимает d, a, b
Остается только с*/



//1 способ решения
//(a * b * c * !d) + (!a*!b * c) +  (c * d);

//    (1*1*1*0)+(0*0*1)+(1*1)
//       0+0+1=1
/*1. Заменим логическое И «&&» на умножение, а логическое ИЛИ «||» - на плюс
false && false  |   0 * 0   |   0
false && true   |   0 * 1   |   0
true  && false  |   1 * 0   |   0
true  && true   |   1 * 1   |   1

false || false  |   0 + 0   |   0
false || true   |   0 + 1   |   1
true  || false  |   1 + 0   |   1
true  || true   |   1 + 1   |   1

(abc!d) + (!ac) + (!bc) + (cd)

2. Раскроем скобки
abc!d   + !ac   + !bc   + cd

3. Вынесем «c» за скобки
c(ab!d  + !a    + !b    + d)

Здесь понадобятся базовые правила булевой алгебры
a + !a  = 1
a + ab  = a
a + !ab = a + b

4. Упростим «ab!d + !a»     //не понятно как упрощаем -см на пункт выше
c(b!d   + !a    + !b    + d)    //ab!d + !a=  b!d   + !a

5. Упростим «b!d + !b» // b!d + !b=!d  + !b
c(!d    + !a    + !b    + d)

6. Упростим «!d + d»   //=1
c(!a    + !b    + 1)

7. Теперь в скобках есть выражение «что-то + 1», что всегда дает «1» (вторая таблица)
c(1)

8. Теперь есть выражение «что-то * 1», что всегда дает «что-то» (первая таблица)
c*/