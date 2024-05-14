package com.shivvas.practice.behavioral.chainOfResponsibility.logManagers;

import com.shivvas.practice.behavioral.chainOfResponsibility.enums.LogLevel;


public class InfoLogManager extends AbstractLogManager {

    public InfoLogManager(ILogManager superLogManager) {
        super(superLogManager);
    }

    @Override
    public void log(LogLevel level, String message) {
        if(level.equals(LogLevel.INFO)) {
            System.out.println("INFO: " + message);
        } else {
            super.log(level, message);
        }
    }
}
