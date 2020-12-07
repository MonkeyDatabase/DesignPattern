package io.github.monkeydatabase.observer.weather.improved;

public interface Observer {

    void update(float temperature, float pressure, float humidity);
}
