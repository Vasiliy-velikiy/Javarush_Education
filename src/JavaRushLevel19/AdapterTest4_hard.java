package JavaRushLevel19;

import java.util.HashMap;
import java.util.Map;
/*Адаптировать Customer и Contact к RowItem.
Классом-адаптером является DataAdapter.

Инициализируй countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
*/
public class AdapterTest4_hard {


    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }
    public static void main(String[] args) {

//тестирование адаптера
Customer customer=new Customer() {
    @Override
    public String getCompanyName() {
        return "JavaRush Ltd.";
    }

    @Override
    public String getCountryName() {
        return "Ukraine";
    }
};

Contact contact=new Contact() {
    @Override
    public String getName() {
        return "Ivanov, Ivan";
    }

    @Override
    public String getPhoneNumber() {
        return "+38(050)123-45-67";
    }
};

DataAdapter dataAdapter=new DataAdapter(customer, contact);
        System.out.println(dataAdapter.getDialString());
        System.out.println(dataAdapter.getContactFirstName());
        System.out.println(dataAdapter.getContactLastName());



    }








    public static class DataAdapter implements RowItem{
       private   Customer customer;
      private   Contact contact;


        public DataAdapter(Customer customer,Contact contact) {
            this.customer=customer;
            this.contact=contact;

        }

        @Override
        public String getCountryCode() {
            String key="";
            for (String k:countries.keySet()){//находим значение по ключу
                if (countries.get(k).equals(this.customer.getCountryName())){
                    key=k;
                    break;
                }
            }
            return key;
        }

        @Override
        public String getCompany() {
            return this.customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[]strings=this.contact.getName().split(" ");
            String lastname=strings[0].substring(0, strings[0].length()-1);
            String firsname=strings[1];
            return firsname;
        }

        @Override
        public String getContactLastName() {
            String[]strings=this.contact.getName().split(" ");
            String lastname=strings[0].substring(0, strings[0].length()-1);
            String firsname=strings[1];
            return lastname;
        }

        @Override
        public String getDialString() {

            String s=this.contact.getPhoneNumber();

          StringBuilder newstring=new StringBuilder();
            for (int i = 0; i <s.length() ; i++) {// цикл пробегает по индексу строки
                newstring.append(s.charAt(i) !='('&&s.charAt(i) !=')'&&s.charAt(i) !='-'?s.charAt(i) : "");//убираем ненужные элементы

            }
String newStr=newstring.toString();
            return "callto://"+ newStr;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or// ...
    }
}
