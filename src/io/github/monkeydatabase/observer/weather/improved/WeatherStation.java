package io.github.monkeydatabase.observer.weather.improved;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observer> observers;

    public WeatherStation() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        System.out.println(" connected");
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println(" disconnected");
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(temperature,pressure,humidity);
        }
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
        notifyObservers();
    }
}
