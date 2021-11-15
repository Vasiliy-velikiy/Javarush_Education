package JavaRushLevel20;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*В методе main() происходит считывание пути к файлу с консоли и заполнение runtimeStorage данными из файла.
Тебе необходимо в методе save() реализовать логику записи в файл для карты runtimeStorage, а в методе load()
- логику чтения из файла для runtimeStorage.
Файл должен быть в формате .properties. Комментарии в файле игнорируй.
Про .properties прочитай в вики.
Подсказка: используй объект класса Properties.*/
public class PropertiesTest_hard {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        // ДОРАБОАТЬ ВАРИАНТ РЕШЕНИЯ БЕЗ properties
        /*
        PrintWriter writer=new PrintWriter(outputStream);
        for (Map.Entry pair:runtimeStorage.entrySet()) {
            String key=pair.getKey().toString();
            String value=pair.getValue().toString();
            //при считывании между парой может быть пробел а может быть a:b,  a=b, или a b
            String []strsplit=str.split("[=:]");
            writer.println(key+" \\ "+value+"\r\n");


         */

        Properties properties=new Properties();
        for (Map.Entry<String,String> pair:runtimeStorage.entrySet()) {
            properties.setProperty(pair.getKey(), pair.getValue());
        }
        properties.store(outputStream, null);

       /* Properties properties=new Properties();
        properties.store(outputStream);
       for (Map.Entry pair:properties.entrySet()){
     writer.println(pair);

       }
// writer.close();
        */




        //напишите тут ваш код
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties properties=new Properties();
        properties.load(inputStream);//вводит список свойств из входного потока

        for (Map.Entry pair:properties.entrySet()){
           runtimeStorage.put(pair.getKey().toString(),pair.getValue().toString() );

        }
        //напишите тут ваш код
    }

    public static void main(String[] args) throws IOException {

        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                FileInputStream fos = new FileInputStream(reader.readLine()))
        {




            //String one=properties.getProperty("1");
            //System.out.println(one);



           // runtimeStorage.put("1", "ben");
           // runtimeStorage.put("2", "laden");
            //runtimeStorage.put("13", "terorist");

            //save(outputStream);

            load(fos);



        }  catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}

