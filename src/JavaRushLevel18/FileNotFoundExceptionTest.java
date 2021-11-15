package JavaRushLevel18;

import java.io.*;

/*Читайте с консоли имена файлов.
Если файла не существует (передано неправильное имя файла), то перехватить
 исключение FileNotFoundException, вывести в консоль переданное неправильное имя файла и
  завершить работу программы.
Закрыть потоки.
Не используй System.exit();*/
public class FileNotFoundExceptionTest {

    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
       //FileInputStream fileInputStream=null;
        String s=null;

        //не проходит условие по даннумц решению
        /*
        try {
            while (true) {
                s = bf.readLine();
                fileInputStream = new FileInputStream(s);
            }
        } catch (FileNotFoundException e){
            //e.printStackTrace();
            System.out.println(s);


        }
         finally {
            fileInputStream.close();
            bf.close();
        }

         */

//Конструкцию try-with-resources ввели в Java 7. Она дает возможность объявлять один или несколько ресурсов в
// блоке try, которые будут закрыты автоматически без использования finally блока.
//Если try блок также выбрасывает исключение, оно побеждает, а исключение из close() метода подавляется


        //вариант try-with-resources

        while (true) {
            s=bf.readLine();
            try ( FileInputStream fileInputStream = new FileInputStream(s)) {

            }
            catch (FileNotFoundException e){
                System.out.println(s);

                bf.close();
                break;
            }


        }
    }
}
