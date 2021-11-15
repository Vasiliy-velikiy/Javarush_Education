package JavaRushLevel23;
/*Запрети создание экземпляров класса Listener.*/
public class FinalTest3 {
   public abstract static class Listener {//запрешено создавать экземпляры абстрактных классов
        public void onMouseDown(int x, int y) {
            // Do something when the mouse down event occurs
        }

        public void onMouseUp(int x, int y) {
            // Do something when the mouse up event occurs
        }
    }

    public static void main(String[] args) {

    }

}
