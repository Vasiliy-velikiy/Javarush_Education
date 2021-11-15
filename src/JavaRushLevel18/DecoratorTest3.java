package JavaRushLevel18;

import java.util.List;

/*Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для TableInterface.
Метод setModel должен вывести в консоль количество элементов в списке перед обновлением модели
 (вызовом метода setModel у объекта типа TableInterface).
Метод getHeaderText должен возвращать текст в верхнем регистре - используй метод toUpperCase().*/
public class DecoratorTest3 {



    public class TableInterfaceWrapper implements TableInterface {
        TableInterface tableInterface;

                 TableInterfaceWrapper(TableInterface tableInterface){
    this.tableInterface=tableInterface;
}

        @Override
        public void setModel(List rows) {
            tableInterface.setModel(rows);
            System.out.println(rows.size());
        }

        @Override
        public String getHeaderText() {
                  return    tableInterface.getHeaderText().toUpperCase();

        }

        @Override
        public void setHeaderText(String newHeaderText) {
tableInterface.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}
