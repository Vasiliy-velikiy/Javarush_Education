package JavaRushLevel15;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*Для решения этой задачи:
Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.*/
public class FileInStaticBlock_medium {


    public static List<String> lines = new ArrayList<String>();
        public static void main (String[]args) throws IOException {

            System.out.println(lines);
        }

        //3 Способ
    static {
            try{
                //Scanner sc= new Scanner(System.in);
                BufferedReader file=new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
                String line;
                while ((line=file.readLine())!=null){
                    lines.add(line);
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }




class Statics extends FileInStaticBlock_medium  {
    public static String FILE_NAME ="C:/ConsUserData/CONS.CFG/MyContracts/1.txt";




}
//1 способ добавления сразу всех строк
/* Statics statics=new Statics();
        lines=new BufferedReader(new FileReader(statics.FILE_NAME)).lines().collect(Collectors.toList());*/

//2 способ
/* static {
                try {
                    Statics statics = new Statics();
                    BufferedReader reader = new BufferedReader(new FileReader(statics.FILE_NAME));
                    //это тоже самое что и
                    // FileReader fileReader=new FileReader(statics.FILE_NAME);
                    //BufferedReader reade=new BufferedReader(fileReader);

                    String s = reader.readLine();
                    while ((s = reader.readLine()) != null) {
                        lines.add(s);

                    }
                } catch (Exception e) {
                }
            }*/

/*
    static {
        try {
            Statics statics = new Statics();
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
            //это тоже самое что и
            // FileReader fileReader=new FileReader(statics.FILE_NAME);
            //BufferedReader reade=new BufferedReader(fileReader);

            String s = reader.readLine();
            while (reader.ready()) {
                lines.add(reader.readLine());

            }
        } catch (Exception e) {
        }
    }*/