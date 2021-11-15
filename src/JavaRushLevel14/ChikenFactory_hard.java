package JavaRushLevel14;
/*Давай напишем Фабрику (Factory) по производству кур (Hen):
Создай класс Hen.
Сделай его абстрактным.
Добавь в класс абстрактный метод int getCountOfEggsPerMonth().
Добавь в класс метод String getDescription(), который возвращает строку "Я - курица.".
Создай класс RussianHen, который наследуется от Hen.
Создай класс UkrainianHen, который наследуется от Hen.
Создай класс MoldovanHen, который наследуется от Hen.
Создай класс BelarusianHen, который наследуется от Hen.
В каждом из четырех последних классов напиши свою реализацию метода getCountOfEggsPerMonth.
Методы должны возвращать количество яиц в месяц от данного типа куриц.
В каждом из четырех последних классов напиши свою реализацию метода getDescription.
Методы должны возвращать строку вида:
<getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
где Sssss - название страны
где N - количество яиц в месяц

В классе HenFactory реализуй метод getHen, который возвращает соответствующую стране породу кур.
Все созданные классы должны быть в отдельных файлах.*/
public class ChikenFactory_hard {



    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        //Hen hen2 = HenFactory.getHen(Country.RUSSIA);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
        //System.out.println(hen2.getDescription());
    }


    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;

            if (country.equals(Country.UKRAINE)) {
                hen = new UkrainianHen();

            } else if (country.equals(Country.RUSSIA)) {
                hen = new RussianHen();

            } else if (country.equals(Country.MOLDOVA)) {
                hen = new MoldovanHen();


            } else if (country.equals(Country.BELARUS)) {
                hen = new BelarusianHen();

            }
            return hen;
        }

    }
}

interface Country {
    String UKRAINE = "Ukraine";
    String RUSSIA = "Russia";
    String MOLDOVA = "Moldova";
    String BELARUS = "Belarus";
}



    abstract  class Hen  {
        abstract int getCountOfEggsPerMonth();

        String getDescription() {
            return "Я - курица.";
        }
    }


 class MoldovanHen extends Hen{
    int counteggs = 50;

    @Override
    int getCountOfEggsPerMonth() {
        return counteggs;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %s яиц в месяц.", Country.MOLDOVA, getCountOfEggsPerMonth());
    }
}
 class BelarusianHen extends Hen {
    int counteggs = 300;

    @Override
    int getCountOfEggsPerMonth() {
        return counteggs;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %s яиц в месяц.", Country.BELARUS, getCountOfEggsPerMonth());
    }
}
 class UkrainianHen extends Hen{
    int counteggs = 200;

    @Override
    int getCountOfEggsPerMonth() {
        return counteggs;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %s яиц в месяц.", Country.UKRAINE, getCountOfEggsPerMonth());
    }
}
 class RussianHen extends Hen{
    int counteggs = 100;

    @Override
    int getCountOfEggsPerMonth() {
        return counteggs;
    }

    @Override
    String getDescription() {
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %s яиц в месяц.", Country.RUSSIA, getCountOfEggsPerMonth());
    }
}