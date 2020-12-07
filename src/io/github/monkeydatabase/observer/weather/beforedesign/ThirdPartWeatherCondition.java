package io.github.monkeydatabase.observer.weather.beforedesign;

//该类为第三方的实时状态
public class ThirdPartWeatherCondition {
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        System.out.println("this is third part company, receiver data done!");
        System.out.println("showing the collected data");
        display();
    }

    public void display(){
        System.out.println("Temperature is "+temperature+" now");
        System.out.println("Pressure is "+pressure+" now");
        System.out.println("Humidity is "+humidity+" now");
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
