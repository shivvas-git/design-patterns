package com.shivvas.practice.ObserverPattern.observables;

import com.shivvas.practice.ObserverPattern.observers.IObserver;
import org.springframework.stereotype.Component;


@Component
public class TemperatureObservable implements IObservable {

    String temperature = "30C";

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
        updateObservers();
    }

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void updateObservers() {
        for (IObserver observer: observers) {
                observer.update(this);
        }
    }
}
