package JavaRushLevel10;
/*Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.*/
public class ConstructorsOfHuman {
    public static void main(String[] args) {
    }

    public static class Human {
         private String name1;
        private  int age2;
        private int weight3;
        private int height4;
        private String colorEyes5;
        private String hobbi6;

       public Human(){

        }
        public Human(String name1){
            this.name1=name1;

        }
        public Human(int age2,int weight3){
            this.age2=age2;

        }
        public Human(int weight3){
            this.weight3=weight3;

        }
        public  Human(int height4,String hobbi6){
            this.height4=height4;

        }
        public Human(String colorEyes5,String name1,String hobbi6 ){
            this.colorEyes5=colorEyes5;

        }
        public Human(String hobbi6,int age2,int height4 ){
            this.hobbi6=hobbi6;

        }
        public Human(String name1, int age2, String hobbi6){
            this.name1=name1;
            this.age2=age2;

        }
        public Human(String name1, String hobbi6){
            this.name1=name1;
            this.hobbi6=hobbi6;

        }
        public Human(String name1,int weight3){
            this.name1=name1;
            this.weight3=weight3;

        }

        // Напишите тут ваши переменные и конструкторы
    }

}
