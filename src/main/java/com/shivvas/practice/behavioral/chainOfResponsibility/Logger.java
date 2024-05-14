package com.shivvas.practice.behavioral.chainOfResponsibility;

import com.shivvas.practice.behavioral.chainOfResponsibility.enums.LogLevel;
import com.shivvas.practice.behavioral.chainOfResponsibility.logManagers.ErrorLogManager;
import com.shivvas.practice.behavioral.chainOfResponsibility.logManagers.ILogManager;
import com.shivvas.practice.behavioral.chainOfResponsibility.logManagers.InfoLogManager;

public class Logger {

    ILogManager iLogManager;

    public Logger() {
        this.iLogManager = new ErrorLogManager(new InfoLogManager(null));
    }

    public void warn(String message) {
        iLogManager.log(LogLevel.WARN, message);
    }

    public void info(String message) {
        iLogManager.log(LogLevel.INFO, message);
    }

    public void error(String message) {
        iLogManager.log(LogLevel.ERROR, message);
    }
}
