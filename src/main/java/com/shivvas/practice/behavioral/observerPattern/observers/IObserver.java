package com.shivvas.practice.behavioral.observerPattern.observers;

import com.shivvas.practice.behavioral.observerPattern.observables.IObservable;


public interface IObserver {

    void update(IObservable observable);

    void subscribe(IObservable observable);

    void unsubscribe(IObservable observable);

}
