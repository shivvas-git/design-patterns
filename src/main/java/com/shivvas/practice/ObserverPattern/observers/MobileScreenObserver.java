package com.shivvas.practice.ObserverPattern.observers;

import com.shivvas.practice.ObserverPattern.observables.IObservable;
import com.shivvas.practice.ObserverPattern.observables.TemperatureObservable;
import org.springframework.stereotype.Component;

@Component
public class MobileScreenObserver extends AbstractObserver {

    @Override
    public void update(IObservable observable) {
        if(observable instanceof TemperatureObservable temperatureObservable) {
            updateTemperature(temperatureObservable);
        }

    }

    private void updateTemperature(TemperatureObservable temperatureObservable) {
        System.out.println("Updated temperature to display on mobile: " + temperatureObservable.getTemperature());
        //display to mobile screen
    }
}
