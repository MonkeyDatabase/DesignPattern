package io.github.monkeydatabase.observer.weather.improved;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation();
        AAA aaa=new AAA();
        BBB bbb=new BBB();
        weatherStation.registerObserver(aaa);
        weatherStation.registerObserver(bbb);

        weatherStation.setData(200,100,100);


        weatherStation.removeObserver(aaa);
        weatherStation.setData(333,100,100);
        weatherStation.removeObserver(bbb);
    }
}
