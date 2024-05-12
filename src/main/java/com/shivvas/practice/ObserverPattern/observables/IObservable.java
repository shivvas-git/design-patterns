package com.shivvas.practice.ObserverPattern.observables;

import com.shivvas.practice.ObserverPattern.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public interface IObservable {

    List<IObserver> observers = new ArrayList<>();

    void addObserver(IObserver observers);

    void removeObserver(IObserver observers);

    void updateObservers();
}
