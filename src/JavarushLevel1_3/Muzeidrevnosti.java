public class Muzeidrevnosti {
    public static void main(String[] args) {
        Artifact artifact1 = new Artifact(123);
        Artifact artifact2=new Artifact(213,"Acteki");
        Artifact artifact3=new Artifact(134,"Maia",12);
    }


    static class Artifact {

        Artifact(int number) {
            System.out.println(number);
        }

        Artifact(int number, String culture) {
            System.out.println(number+" "+culture);
        }

        Artifact(int number, String culture, int century) {
            System.out.println(number+" "+culture+" "+century);
        }
    }
}
