package Stream;

import java.io.FileInputStream;
import java.io.IOException;

public  class CountByte {
    public static void main(String[] args) throws IOException {
        String s = "C:/Users//Василий/Documents/тестовые_документы/1.txt";
        FileInputStream fileInputStream=new FileInputStream(s);
        int sum=0;
        while (fileInputStream.available()>0){//пока в файле имется какие то байты для чтения -будет происходить действие ниже
            int i=fileInputStream.read();
            System.out.print(i+" ");
            sum+=i;
            //чтение inputStream.read()-будет происходить построчно-тоесть каждый символ будет преобразовываться в двоичный код
//например в файле три символа:123- каждый из них в кодировке ANSII кодируется 1 байтом, итого у нас 3 байта (по 8бит)
//для 1-00110001, для 2-00110010, для 3-00110011, далее они преобразуются в десятичную систему: для 1-это цифра 49,
// для2-50,для 3-51
//изза особенностей кодировки, руские символы будут кодироваться 2ми(или помоему даже 3 байтами)
        }
        System.out.println();
        System.out.println(sum);

    }
}