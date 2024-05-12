package com.shivvas.practice.ObserverPattern.observers;

import com.shivvas.practice.ObserverPattern.observables.IObservable;
import com.shivvas.practice.ObserverPattern.observables.TemperatureObservable;

public class MonitorScreenObserver extends AbstractObserver {

    @Override
    public void update(IObservable observable) {
        TemperatureObservable temperatureObservable1 = (TemperatureObservable) observable;
        System.out.println("Updated temperature to display on monitor: " + temperatureObservable1.getTemperature());
        //display to monitor screen
    }
}
