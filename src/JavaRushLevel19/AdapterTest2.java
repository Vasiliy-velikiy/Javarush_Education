package JavaRushLevel19;

import java.util.HashMap;
import java.util.Map;

/*Давай представим ситуацию, что с одной стороны у нас есть некая база данных, в которой хранятся данные.
База данных имеет стандартный набор команд (методов) для предоставления данных, они описаны в интерфейсе IncomeData.
 Примеры представления данных приведены в комментариях около каждого метода. С другой стороны есть пользователи, которые
  хотят получать данные из этой базы, но в каком-то другом (конкретном) формате. Запросы от пользователей представлены
   методами в интерфейсах Customer и Contact. Там же (в комментариях около каждого метода) есть примеры представления
   информации в том виде, в котором пользователи хотят ее получать из базы данных.

Твоя задача: написать логику класса адаптера IncomeDataAdapter, который будет по запросам методов из интерфейсов
Customer и Contact, обращаться в базу (методы интерфейса IncomeData), получать данные, обрабатывать их, при необходимости
изменять представление, и возвращать в виде результата.

Инициализируй countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada

При необходимости дополни начало телефонного номера (без кода страны) нулями до 10 цифр (смотри примеры в комментарии
к соответствующему методу). Обрати внимание на формат вывода телефона, фамилии и имени человека (смотри примеры в
комментарии к соответствующему методу).*/

public class AdapterTest2 {

    public static Map<String, String> countries = new HashMap<String, String>();

static {
    countries.put("UA", "Ukraine");
    countries.put("RU","Russia" );
    countries.put("CA", "Canada");
}

    public static void main(String[] args) {



//работает
IncomeData incomeData1=new IncomeData() {
    @Override
    public String getCountryCode() {
        return "UA";
    }

    @Override
    public String getCompany() {
        return "JavaRush Ltd.";
    }

    @Override
    public String getContactFirstName() {
        return "Ivan";
    }

    @Override
    public String getContactLastName() {
        return "Ivanov";
    }

    @Override
    public int getCountryPhoneCode() {
        return 38;
    }

    @Override
    public int getPhoneNumber() {
        return 501234567;
    }
};


Customer customer=new IncomeDataAdapter(incomeData1);
Contact contact=new IncomeDataAdapter(incomeData1);
        System.out.println(contact.getPhoneNumber());








    }

//по запросам методов реализуемых интерфейсов обращается в базу данных-т.е основа у нас база данных-она же должна быть внутри всех методов-и далее мы ее одаптируем под требуемый вывод


    public static class IncomeDataAdapter implements Customer, Contact{
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data=data;
        }

        @Override
        public String getCompanyName() {
            return   this.data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(this.data.getCountryCode());
        }

        @Override
        public String getName() {
            return    this.data.getContactLastName()+", "+this.data.getContactFirstName();
        }
        //String s= String.valueOf(this.incomeData.getPhoneNumber());
        @Override
        public String getPhoneNumber() {

            String pnumber,inumber;
            pnumber="+"+this.data.getCountryPhoneCode();
            inumber= String.valueOf(this.data.getPhoneNumber());//валидатор не пропускает этот пункт если не вставить valueof. потому что метод имеет тип возвращаемого значения int
            while (inumber.length()<10){//если телефон состоит из 4 цифр-добиваем нулями до 10 цифр

                inumber="0"+inumber;//добиваем до 10 цифр
            }
            pnumber=pnumber+"("+inumber.substring(0, 3)+")"+inumber.substring(3, 6)+"-"
                    +inumber.substring(6, 8)+"-"+inumber.substring(8);//подгоняем под требуемый формат

            return pnumber;
        }
    }



    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

       int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}
