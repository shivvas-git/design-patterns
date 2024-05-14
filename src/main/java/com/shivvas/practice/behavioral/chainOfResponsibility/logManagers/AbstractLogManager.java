package com.shivvas.practice.behavioral.chainOfResponsibility.logManagers;

import com.shivvas.practice.behavioral.chainOfResponsibility.enums.LogLevel;

public abstract class AbstractLogManager implements ILogManager {

    private ILogManager superLogManager;

    public AbstractLogManager(ILogManager superLogManager) {
        this.superLogManager = superLogManager;
    }

    public AbstractLogManager() {}

    @Override
    public void log(LogLevel level, String message) {
        if(superLogManager!=null) {
            superLogManager.log(level, message);
        } else {
            System.out.print("Handling of log level: " + level.name() + " is not written");
        }
    }
}
