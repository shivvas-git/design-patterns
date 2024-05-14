package com.shivvas.practice.behavioral.observerPattern.observers;

import com.shivvas.practice.behavioral.observerPattern.observables.IObservable;
import com.shivvas.practice.behavioral.observerPattern.observables.TemperatureObservable;
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
