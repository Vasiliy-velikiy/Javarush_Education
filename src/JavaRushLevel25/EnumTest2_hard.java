package JavaRush;

import java.util.Arrays;
import java.util.IllegalFormatCodePointException;
import java.util.LinkedList;
import java.util.List;

/*Реализуй интерфейс Columnable у Column, описание методов смотрите в джавадоках.
Реализуй логику метода Column.getVisibleColumns.
Метод Column.configureColumns уже реализован, его не меняй.
Создавать дополнительные поля нельзя.
Метод main не участвует в тестировании.*/
public class EnumTest2_hard {

    /**
     * Output:
     * <p/>
     * Available Amount
     * Account Number
     * Bank Name
     * --------------------
     * Available Amount
     * Bank Name
     */
    public static void main(String[] args) {

        Column.configureColumns(Column.Amount, Column.AccountNumber, Column.BankName);
       // Column.configureColumns(Column.Customer, Column.AccountNumber, Column.BankName);
        System.out.println("Output:");
        System.out.println("<p/>");
        for (Columnable columnable : Column.getVisibleColumns()) {
            System.out.println(columnable.getColumnName());
        }

        System.out.println("--------------------");
        Column.AccountNumber.hide();
       /// Column.Customer.hide();

        for (Columnable columnable : Column.getVisibleColumns()) {
            System.out.println(columnable.getColumnName());
        }
    }
}






enum Column implements Columnable{
    Customer("Customer"),
    BankName("Bank Name"),
    AccountNumber("Account Number"),
    Amount("Available Amount");

    private String columnName;

    private static int[] realOrder;

    private Column(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Задает новый порядок отображения колонок, который хранится в массиве realOrder.
     * realOrder[индекс в энуме] = порядок отображения; -1, если колонка не отображается.
     *
     * @param newOrder новая последовательность колонок, в которой они будут отображаться в таблице
     * @throws IllegalArgumentException при дубликате колонки
     */
    public static void configureColumns(Column... newOrder) {

        realOrder = new int[values().length];   //создание массива на 4 элемента(столько элементов в енуме)
        for (Column column : values()) {        //values() - позволяет получить массив всех значений Enum.      перебор по количеству элементов
            realOrder[column.ordinal()] = -1;   //ordinal()-возвращает порядковый номер элемента. ??-У ВСЕХ ЭЛЕМЕНТОВ В МАССИВЕ realOrderБУДЕТ -1? ПОЧЕМУ
            boolean isFound = false;

            // новый порядок-newOrder:  (Column.Customer, Column.AccountNumber, Column.BankName)
            for (int i = 0; i < newOrder.length; i++) {
                if (column == newOrder[i]) {      //если элемент из  старой последовательности равен элементу из новой послежоветльности
                    if (isFound) {              //если isFound true -выкидывается исключение
                        throw new IllegalArgumentException("Column '" + column.columnName + "' is already configured.");
                    }
                                                //далее массиву  realOrder[индекс в энуме] присваивается индекс i
                    realOrder[column.ordinal()] = i;//по сути  realOrder хранит порядок оторбражения нового порядка колонок
                    isFound = true;             //флаг изменяется
                }
            }
        }
    }



    /**
     * Вычисляет и возвращает список отображаемых колонок в сконфигурированом порядке (см. метод configureColumns)
     * Используется поле realOrder.
     *
     * @return список колонок
     */
    public static List<Column> getVisibleColumns() {
        List<Column> result = new LinkedList<>();
        Column[]columns=Column.values();
        for (int i = 0; i <realOrder.length ; i++) {
            result.add(null);
        }




        for (int i = 0; i < realOrder.length ; i++) {
                                   //(инд нового порядка,знач в енуме)
            if(realOrder[i]!=-1) result.set(realOrder[i],columns[i]);//realOrder[i]-индекс нового порядка, если realOrder[1]=2 это значит что берется попордяку элементы realOrder[i] и смотрится их значение  (массив 1 в енуме  должен располагаться во 2 индексе нового порядка )
        }                                                           //а columns[i] и i=1 значит что берется массив 1 в енуме


        for (int i = result.size()-1; i >0 ; i--) {
            if (result.get(i)==null)result.remove(i);

        }
        return result;
    }

    @Override
    public String getColumnName() {
        return columnName;
    }

    @Override
    public boolean isShown() {
     boolean isshow=false;
     if(realOrder[this.ordinal()]!=-1) isshow=true;
      return isshow;
    }

    @Override
    public void hide() {
int push=this.ordinal();
  int number=realOrder[push];
  realOrder[push]=-1;
  int[]realOrderclone=realOrder.clone();
        for (int r = 0; r <realOrderclone.length ; r++) {
            int numberTemp=realOrderclone[r];
            if (numberTemp > number)realOrder[r]=numberTemp-1;
        }

 //   Column.valueOf("Customer");
//realOrder[push]=-1;
    }
}

interface Columnable {

    /**
     * @return полное имя колонки
     */
    String getColumnName();

    /**
     * Возвращает true, если колонка видимая, иначе false
     */
    boolean isShown();

    /**
     * Скрывает колонку - маркирует колонку -1 в массиве realOrder.
     * Сдвигает индексы отображаемых колонок, которые идут после скрытой
     */
    void hide();

    /**
     * Возвращает порядок константы в энуме.
     *
     * @return порядок константы в энуме
     */
    int ordinal();
}