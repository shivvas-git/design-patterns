package com.shivvas.practice.behavioral.observerPattern.observers;

import com.shivvas.practice.behavioral.observerPattern.observables.IObservable;

public abstract class AbstractObserver implements IObserver {

    public void subscribe(IObservable observable) {
        observable.addObserver(this);
    }

    public void unsubscribe(IObservable observable) {
        observable.removeObserver(this);
    }

}
