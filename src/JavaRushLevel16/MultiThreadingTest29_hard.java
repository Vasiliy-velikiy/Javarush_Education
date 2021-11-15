import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*1. Разберись, что делает программа.
2. В статическом блоке считай 2 имени файла firstFileName и secondFileName.
3. Внутри класса Solution создай нить public static ReadFileThread, которая реализует
интерфейс ReadFileInterface (Подумай, что больше подходит - Thread или Runnable).
3.1. Метод setFileName должен устанавливать имя файла, из которого будет читаться содержимое.
3.2. Метод getFileContent должен возвращать содержимое файла.
3.3. В методе run считай содержимое файла, закрой поток. Раздели пробелом строки файла.
4. Подумай, в каком месте нужно подождать окончания работы нити, чтобы обеспечить последовательный вывод файлов.
4.1. Для этого добавь вызов соответствующего метода.

Ожидаемый вывод:
[все тело первого файла]
[все тело второго файла]*/
    public class MultiThreadingTest29_hard {
        static BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        public static String firstFileName;
        public static String secondFileName;

        static {
            try {
                firstFileName=bufferedReader.readLine();
                secondFileName=bufferedReader.readLine();
                bufferedReader.close();


            } catch (IOException e) {
                e.printStackTrace();
            }


        }//add your code here - добавьте код тут

        public static void main(String[] args) throws Exception {
            systemOutPrintln(firstFileName);
            systemOutPrintln(secondFileName);

        }

        public static void systemOutPrintln(String fileName) throws Exception {
            ReadFileInterface f = new ReadFileThread();
            f.setFileName(fileName);
            f.start();
            f.join();
            //add your code here - добавьте код тут
            System.out.println(f.getFileContent());
        }

        public interface ReadFileInterface  {

            void setFileName(String fullFileName) throws Exception;

            String getFileContent() throws IOException;

            void join() throws InterruptedException;

            void start();
        }


        public  static class ReadFileThread extends Thread  implements ReadFileInterface {
            String joined="";
            FileReader inputStream=null;




            @Override
            public void setFileName(String fullFileName) throws Exception {
inputStream=new FileReader(fullFileName);

            }


//здесь метод start не нужен т.к в строчке 46 он будет перебивать метод run и ничего не выведется
    //еще один способ-вспрятать логику вывода строки в метод  getFileContent():
    // но не пройдет решение  по 1му пункту
            /*  public void setFileName(String fullFileName) throws Exception {
inputStream=new FileReader(fullFileName);


            }

            @Override
            public String getFileContent() throws IOException {
                List<String> list =new ArrayList<>();
                BufferedReader reader = new BufferedReader(inputStream);
                String line=null;

                while((line=reader.readLine())!=null) {
                    list.add(line);
                }
                String joined = String.join(" ", list);

                if(list.isEmpty()) return null;
                else
                    return joined;


            }

            @Override
            public void run() {
                try {
                    setFileName(firstFileName);
                    setFileName(secondFileName);
                    getFileContent();


                } catch (Exception e) {
                    e.printStackTrace();
                }

             */

            public void run() {

                List<String> list =new ArrayList<>();

                BufferedReader reader = new BufferedReader(inputStream);
                String line=null;


                try {
                    while((line=reader.readLine())!=null){
                        list.add(line);
                    }
                    joined=String.join(" ", list);


                } catch (Exception e) {
                    e.printStackTrace();
                }



            }

            public String getFileContent() throws IOException {
                return joined;

            }
        }
        //add your code here - добавьте код тут


}
