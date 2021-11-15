package JavaRushLevel18;

import java.io.*;

/*Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.*/

/*
        while ((bytesAmount =fileInputStream1.read(buffer))>0){
            if(bytesAmount<=(fileInputStream1.available()/2)) {

                fileOutputStream1.write(buffer1, 0, bytesAmount);
            }
            //else if (bytesAmount>=(fileInputStream1.available()/2)){
                //fileOutputStream2.write(buffer2,0,bytesAmount);
            //}
        }



 */
public class WriteInThreeFiles {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String filename1 = bufferedReader.readLine();
        String filename2 = bufferedReader.readLine();
        String filename3 = bufferedReader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(filename1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(filename2);
        FileOutputStream fileOutputStream3 = new FileOutputStream(filename3);

        byte[] buffer = new byte[fileInputStream1.available()];
        byte[] buffer1 = new byte[fileInputStream1.available() / 2];
        byte[] buffer2 = new byte[fileInputStream1.available() / 2];

        int bytesAmount = 0;
//если 1 файл -четный то записываем по половине во2 и 3 файл
/*void write(byte[] buffer, int offset, int length): записывает в выходной поток некоторое
число байтов, равное length, из массива buffer, начиная со смещения offset, то есть с
элемента buffer[offset].*/
      //чтобы записать в файлы, нужно сначала прочитать байты и закинуть их в поток

        if (fileInputStream1.available() % 2 == 0) {
            fileInputStream1.read(buffer);
            //читает весь кусок байтов
            fileOutputStream2.write(buffer, 0, buffer1.length);//3позиция -длина байтов, которая будет записываться
 //т.е из буфера buffer начинаются поочереди записываться элементы с нулевого значения и равные половине длины buff или длине buff1
            fileOutputStream3.write(buffer, buffer.length / 2, buffer1.length);
        }


//если число доступных байтов не четное то записываем большу. часть в 1 файл , меньшую в 3

        else if (!(fileInputStream1.available() % 2 == 0)){
         fileInputStream1.read(buffer);
            fileOutputStream2.write(buffer, 0, buffer1.length+1);
            fileOutputStream3.write(buffer, buffer1.length+1 , buffer1.length);

        }










        fileInputStream1.close();
        fileOutputStream2.close();
        fileOutputStream3.close();

    }
}


