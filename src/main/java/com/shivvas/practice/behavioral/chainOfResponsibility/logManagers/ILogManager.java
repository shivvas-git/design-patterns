package com.shivvas.practice.behavioral.chainOfResponsibility.logManagers;

import com.shivvas.practice.behavioral.chainOfResponsibility.enums.LogLevel;

public interface ILogManager {
    void log(LogLevel level, String message);
}
