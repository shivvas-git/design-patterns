package com.shivvas.practice.ObserverPattern;

import com.shivvas.practice.ObserverPattern.observables.TemperatureObservable;
import com.shivvas.practice.ObserverPattern.observers.IObserver;
import com.shivvas.practice.ObserverPattern.observers.MobileScreenObserver;
import com.shivvas.practice.ObserverPattern.observers.MonitorScreenObserver;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Override
    public void run(ApplicationArguments args) {

        TemperatureObservable temperatureObservable = new TemperatureObservable();
        IObserver mobileObserver = new MobileScreenObserver();
        IObserver monitorObserver = new MonitorScreenObserver();

        mobileObserver.subscribe(temperatureObservable);
        monitorObserver.subscribe(temperatureObservable);

        temperatureObservable.setTemperature("32C");

    }
}
