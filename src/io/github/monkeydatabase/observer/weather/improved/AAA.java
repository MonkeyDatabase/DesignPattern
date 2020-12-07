package io.github.monkeydatabase.observer.weather.improved;

public class AAA implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        System.out.println("this is AAA, receive data done!");
        System.out.println("AAA showing the collected data");
        display();
    }

    public void display(){
        System.out.println("AAA Temperature is "+temperature+" now");
        System.out.println("AAA Pressure is "+pressure+" now");
        System.out.println("AAA Humidity is "+humidity+" now");
    }
}
