package Stream;
/*Измени класс TableAdapter так, чтобы он адаптировал ATable к BTable.
Метод getHeaderText должен возвращать такую строку "[username] : tablename".

Пример, "[Amigo] : DashboardTable".*/
public class AdapterTest {
    public static void main(String[] args) {
        //это пример вывода
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Amigo";
            }

            @Override
            public String getTableName() {
                return "DashboardTable";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter implements BTable {
         private ATable aTable;

        public TableAdapter(ATable aTable) {
           this.aTable=aTable;
        }

        @Override
        public String getHeaderText() {
            return "["+this.aTable.getCurrentUserName()+"]" + " : " + this.aTable.getTableName();
        }

    }

    public interface ATable {
        String getCurrentUserName();

        String getTableName();
    }

    public interface BTable {
        String getHeaderText();
    }
    }


