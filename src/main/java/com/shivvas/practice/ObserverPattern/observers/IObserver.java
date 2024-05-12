package com.shivvas.practice.ObserverPattern.observers;

import com.shivvas.practice.ObserverPattern.observables.IObservable;


public interface IObserver {

    void update(IObservable observable);

    void subscribe(IObservable observable);

    void unsubscribe(IObservable observable);

}
