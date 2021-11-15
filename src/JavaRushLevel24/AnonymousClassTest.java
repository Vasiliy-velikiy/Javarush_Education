package JavaRushLevel24;

/*1. Восстанови логику метода someAction для поля solutionAction.
2. Пример вывода смотри в комментарии к методу main.
3. Подсказка: метод someAction анонимного класса поля solutionAction должен вызвать метод сабкласса FirstClass,
если param > 0, иначе вызвать метод сабкласса SecondClass.

Не изменяй метод main!*/
public class AnonymousClassTest implements Action {
    public static int countActionObjects;

    private int param;

    private Action solutionAction = new Action() {


        //напишите тут ваш код
        public void someAction() {

             //вывод соответсвует, но валидацию не проходит
/*

            for (int i = param; i >0; i--) {
                System.out.println(param);
                   param--;
            }

                if (param >= 0) new FirstClass() {
                    @Override
                    public Action getDependantAction() {
                        return null;
                    }
                }.someAction();
                new SecondClass().someAction();
            System.out.println(SecondClass.SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM.substring(1)+""+param);

                //напишите тут ваш код
            */


            for (int i =param; i >0 ; i--) {
                System.out.println(param);
                param--;

               if (param==0){
                    param++;
                    break;
                }
            }


            if (param>0) {

                FirstClass firstClass = new FirstClass() {

                    @Override
                    public Action getDependantAction() {
                        super.someAction();
                        return this;
                    }
                };
                firstClass.getDependantAction();
                param--;
            }
                if(param<=0) {
                SecondClass secondClass=new SecondClass();
                secondClass.someAction();
                System.out.println(SecondClass.SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM.substring(1)+""+param);
                param--;
            }






        }
  };

    public AnonymousClassTest(int param) {
        this.param = param;
    }

    @Override
    public void someAction() {
        solutionAction.someAction();
    }

    /**
     * 5
     * 4
     * 3
     * 2
     * 1
     * class FirstClass, method someAction
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = 0
     * Count of created Action objects is 2
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = -1
     * Count of created Action objects is 3
     */
    public static void main(String[] args) {
        AnonymousClassTest solution = new AnonymousClassTest(5);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);

        solution = new AnonymousClassTest(-1);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);
    }
}

interface Action {
    void someAction();
}


abstract class FirstClass implements Action {     //first implementation

    protected FirstClass() {
        AnonymousClassTest.countActionObjects++;
    }

    public void someAction() {
        System.out.println("class FirstClass, method someAction");
    }

    public abstract Action getDependantAction();
}

 class SecondClass implements Action {   //second implementation
    public static String SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM = "\nSpecific action for anonymous SecondClass, param = ";

    private static String SECOND_CLASS_METHOD_STRING = "class SecondClass, method someAction";

    public SecondClass() {
        AnonymousClassTest.countActionObjects++;
    }

    protected StringBuilder sb = new StringBuilder(SECOND_CLASS_METHOD_STRING);

    public void someAction() {
        System.out.println(sb.toString());
    }
}