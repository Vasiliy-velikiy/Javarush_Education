package JavaRushLevel23;
/*Запрети переопределение метода onMouseDown*/
public class FinalTest2 {

    public static class Listener {
        public final void onMouseDown(int x, int y) {
            // Do something when the mouse down event occurs
        }

        public void onMouseUp(int x, int y) {
            // Do something when the mouse up event occurs
        }
    }
}
