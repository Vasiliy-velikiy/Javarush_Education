package JavaRushLevel13;
/*В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.*/
public class InterfaceTest5 {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>{
        @Override
        public SimpleObject getInstance() {
            return null;
        }
    }
            //допишите здесь ваш код
    {
    }

}
