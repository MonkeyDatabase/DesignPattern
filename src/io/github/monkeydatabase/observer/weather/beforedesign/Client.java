package io.github.monkeydatabase.observer.weather.beforedesign;

public class Client {
    public static void main(String[] args) {
        ThirdPartWeatherCondition thirdPartWeatherCondition=new ThirdPartWeatherCondition();

        WeatherBroadcaster weatherBroadcaster=new WeatherBroadcaster(thirdPartWeatherCondition);

        weatherBroadcaster.setData(121,1346,13498);

        System.out.println("------------------------------");
        System.out.println("one thousand years later");
        System.out.println("------------------------------");
        weatherBroadcaster.setData(-99,-233,666);
    }
}
