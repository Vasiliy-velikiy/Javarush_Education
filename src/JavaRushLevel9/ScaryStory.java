package JavaRushLevel9;

import java.util.ArrayList;

/*. Есть пять классов: красная шапочка, бабушка, пирожок, дровосек, волк.
2. У каждого класса есть 2 поля: убил (killed ArrayList) и съел (ate ArrayList).
3. Необходимые объекты созданы (hood, grandmother, ...).
4. Расставь правильно связи, кто кого съел и убил, чтобы получилась логика сказки "Красная Шапочка".
P.S: пирожки никто не ел. Их только несли. Волк чуток поел. А его потом убили*/
public class ScaryStory {

    public static LittleRedRidingHood hood = new LittleRedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Patty patty = new Patty();
    public static Woodman woodman = new Woodman();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        wolf.ate.add(hood);//у каждого объекта есть два списка- что он съел и кого убил. чтобы создать связь убийца-жертва// голодный- еда
        //нужно через точ.нотацию указать объект кто соверщает действие и кого заносят в список
        wolf.ate.add(grandmother);
        woodman.killed.add(wolf);

        // напишите тут ваш код
    }

    // Красная шапочка
    public static class LittleRedRidingHood extends StoryItem {
    }

    // Бабушка
    public static class Grandmother extends StoryItem {
    }

    // Пирожок
    public static class Patty extends StoryItem {
    }

    // Дровосек
    public static class Woodman extends StoryItem {
    }

    // Волк
    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<>();
        public ArrayList<StoryItem> ate = new ArrayList<>();
    }

}
