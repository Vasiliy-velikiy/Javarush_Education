package JavaRushLevel20;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*При чтении/записи объектов типа Human возникают странные ошибки.
Разберись в чем дело и исправь их.*/
public class HumanEquals_hard_interesting {
    public static void main(String[] args) {
        //в другом файле есть похожая задача-чтобы запустилась без конфликтов я это решение закоментил

        /*
        //исправь outputStream/inputStream в соответствии с путем к твоему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home"), new Asset("car"));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            System.out.println(ivanov.equals(somePerson));
            inputStream.close();

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
       List<Asset> assets = new ArrayList<>();

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;//1п. если объекты сравнивается с сам собой -они равны, или же если два объекта null-они тоже равны
            if (o == null || getClass() != o.getClass()) return false;//2п если первый объект пустой а второй (this!=null) или о -относится к другому классу то объекты не равны
//выполняем приведение o к Human и сравниваем поля. чтобы два human были одинаковые у них должны быть одинаковые имена и списки assets- в противном случае они разные
            Human human = (Human) o;//3пп если мы тут то оба объекта не равны null и являются объектам класса Human, значит их можно сравнивать как Human
      if (!name.equals(human.name))return  false;//3.1если имена разные значит объекты разные
           else if(!assets.equals(human.assets)) return false;//3.2если списки разные значит объекты разные
             else return true;   //3.3 сюда дошли если ненашли различий  -значит объекты одинаковые




            //if (name == null ? !name.equals(human.name) : human.name != null)  return false;
//если списки разные значит объекты разные- return false
         ///return assets != null ? !assets.equals(human.assets) : human.assets == null;

        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
           result = 31 * result + (assets != null ? assets.hashCode() : 0);
            //return (int) (Math.random() * 100);
            return  result;
        }

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter printWriter = new PrintWriter(outputStream);

                printWriter.println(this.name);
                if (this.assets.size() > 0) {
                    for (Asset current : this.assets)
                        printWriter.println(current.getName());
                }


            printWriter.close();

        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                this.name = reader.readLine();
                String assetName;
                while ((assetName = reader.readLine()) != null)
                    this.assets.add(new Asset(assetName));

            reader.close();

        }

        public List<Asset> getAssets() {
            return assets;
        }
    }
}




class Asset {
    public Asset(String name) {
        this.name = name;
    }

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

         */
    }
}