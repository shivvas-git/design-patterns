package com.shivvas.practice.ObserverPattern.observers;

import com.shivvas.practice.ObserverPattern.observables.IObservable;

public abstract class AbstractObserver implements IObserver {

    public void subscribe(IObservable observable) {
        observable.addObserver(this);
    }

    public void unsubscribe(IObservable observable) {
        observable.removeObserver(this);
    }

}
