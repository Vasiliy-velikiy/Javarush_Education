package JavaRushLevel5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.

Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, например "exit", можно с помощью следующей конструкции:

BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
	String s = buffer.readLine();
	if (s.equals("exit"))
	 break;
}*/
public class SumAfterStopWord {

    public static void main(String[] args) throws Exception {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        for( ;true; ){
            String s=bf.readLine();
            if(s.equals("sum")) break;
            int a=Integer.parseInt(s);
            sum=sum+a;

        }
        System.out.println("сумма "+sum);
    }
}
