package com.shivvas.practice.behavioral.observerPattern.observers;

import com.shivvas.practice.behavioral.observerPattern.observables.IObservable;
import com.shivvas.practice.behavioral.observerPattern.observables.TemperatureObservable;

public class MonitorScreenObserver extends AbstractObserver {

    @Override
    public void update(IObservable observable) {
        TemperatureObservable temperatureObservable1 = (TemperatureObservable) observable;
        System.out.println("Updated temperature to display on monitor: " + temperatureObservable1.getTemperature());
        //display to monitor screen
    }
}
