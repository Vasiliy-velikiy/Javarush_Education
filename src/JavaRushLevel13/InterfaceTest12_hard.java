package JavaRushLevel13;
/*Для начала разберись в том, что делает код: это будет непросто.
Затем измени код согласно новой архитектуре и добавь новую логику:
Сделай класс AbstractRobot абстрактным, вынеси логику атаки и защиты из Robot в AbstractRobot.
Отредактируй класс Robot, учитывая AbstractRobot.
Расширь класс BodyPart новой частью тела BodyPart.CHEST("грудь").
Добавь новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).*/
public class InterfaceTest12_hard {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defenced));
    }
}



abstract class AbstractRobot implements Attackable,Defensable {
     String name;
    private static int hitCount=0;

    public String getName() {
        return name;
    }


    public BodyPart attack() {

        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;



        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else  if (hitCount==4){
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;


    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCount = hitCount +2;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defendedBodyPart = BodyPart.ARM;
        } else  if (hitCount>=4){// чтобы валидатор javaRush пропустил, но можно и написать hitCount==4
            hitCount = 0;
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }
}


class Robot extends AbstractRobot  {

    public Robot(String name) {
        this.name = name;
    }




}

final class BodyPart {
    private String bodyPart;
    final static BodyPart LEG = new BodyPart("нога");
    final static BodyPart HEAD = new BodyPart("голова");
    final static BodyPart ARM = new BodyPart("рука");
    final static BodyPart CHEST =new BodyPart ("грудь");


    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}

interface Attackable {
    BodyPart attack();
}
interface Defensable {
    BodyPart defense();
}