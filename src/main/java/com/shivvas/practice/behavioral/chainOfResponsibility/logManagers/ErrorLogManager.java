package com.shivvas.practice.behavioral.chainOfResponsibility.logManagers;

import com.shivvas.practice.behavioral.chainOfResponsibility.enums.LogLevel;

public class ErrorLogManager extends AbstractLogManager {

    public ErrorLogManager(ILogManager superLogManager) {
        super(superLogManager);
    }

    @Override
    public void log(LogLevel level, String message) {
        if(level.equals(LogLevel.ERROR)) {
            System.out.println("ERROR: " + message);
        } else {
            super.log(level, message);
        }
    }
}
