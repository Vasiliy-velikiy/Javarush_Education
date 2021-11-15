package HardTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class tEST {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,String>map=new HashMap<String, String>();
        for(;;){
            String city=reader.readLine();
            if(city.isEmpty()){
                break;
            }
            String name=reader.readLine();
            map.put(name,city);

        }
        String input=reader.readLine();

        for (Map.Entry<String,String>entry:map.entrySet()){
            String key=entry.getKey();
            String value=entry.getValue();

            if (input.equals(key)) {
                System.out.println(value);
            }
        }




    }

}
