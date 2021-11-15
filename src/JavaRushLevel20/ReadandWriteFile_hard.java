package JavaRushLevel20;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Часто необходимо сохранять состояние работы программы. До появления сериализации каждый
делал это своим способом. В этой задаче нужно сохранить в файл состояние работы
 программы и вычитать состояние из файла без использования сериализации.

Реализуй логику записи в файл и чтения из файла для класса Human.
Поле name в классе Human не может быть пустым.
Метод main реализован только для тебя и не участвует в тестировании.

*/
public class ReadandWriteFile_hard {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
           // File your_file_name = File.createTempFile("your_file_name", null);
            File your_file_name = File.createTempFile("your_file_name", ".txt",new File("C:/Users/vamoskalev/Documents/java/newfolder"));
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;//почему тут не ставиться в 2 условии так? assets.equals(human.assets)
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
           PrintWriter writer=new PrintWriter(outputStream);
           writer.println(name);
           if (assets.size()>0) {
               for (Asset asset:assets) {
                   writer.println(asset.getName()+" "+asset.getPrice());
               }
           }
           writer.close();
            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));

            this.name=reader.readLine();
            String assetName;
            Double price;
            while (reader.ready()){
                String[] s=reader.readLine().split(" ");
                assetName=s[0];
                price=Double.parseDouble(s[1]);
                this.assets.add(new Asset(assetName,price));
            }
            reader.close();



            //implement this method - реализуйте этот метод
        }
    }
}


 class Asset {
    public Asset(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Asset asset = (Asset) o;

        if (Double.compare(asset.price, price) != 0) return false;
        return name != null ? name.equals(asset.name) : asset.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}