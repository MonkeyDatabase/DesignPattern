package io.github.monkeydatabase.observer.weather.beforedesign;

public class WeatherBroadcaster {
    private float temperature;
    private float pressure;
    private float humidity;
    private ThirdPartWeatherCondition thirdPartWeatherCondition;

    public WeatherBroadcaster(ThirdPartWeatherCondition thirdPartWeatherCondition) {
        this.thirdPartWeatherCondition = thirdPartWeatherCondition;
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    //主动推送给第三方，但是需要保持到第三方的通信方式
    public void dataChange(){
        System.out.println("this is weather station, here is the newest information");
        thirdPartWeatherCondition.update(getTemperature(),getPressure(),getHumidity());
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
