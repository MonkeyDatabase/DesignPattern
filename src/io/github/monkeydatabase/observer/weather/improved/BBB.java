package io.github.monkeydatabase.observer.weather.improved;

public class BBB implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;


    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        System.out.println("this is BBB, receive data done!");
        System.out.println("BBB showing the collected data");
        display();
    }

    public void display(){
        System.out.println("BBB Temperature is "+temperature+" now");
        System.out.println("BBB Pressure is "+pressure+" now");
        System.out.println("BBB Humidity is "+humidity+" now");
    }
}
