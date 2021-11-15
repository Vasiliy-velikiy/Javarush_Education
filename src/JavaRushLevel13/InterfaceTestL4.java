package JavaRushLevelTest;
/*Реализуй в классе Today интерфейс Weather.
Подумай, как связан параметр type с методом getWeatherType().
Обрати внимание, что интерфейсы Weather и WeatherType уже реализованы в отдельных файлах*/
public class InterfaceTestL4 {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }
    interface Weather{
        String getWeatherType();

    }
    interface WeatherType extends Weather{
        String CLOUDY="Cloudy";
        String FOGGY="Foggy";
        String FREEZING="Freezing";
    }

    static class Today implements WeatherType {
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }

        @Override
        public String getWeatherType() {
            return type;
        }
    }


}
