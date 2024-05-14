package com.shivvas.practice.behavioral.chainOfResponsibility;

public class Application {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.error("testing chain of responsibility design pattern");
        logger.info("testing chain of responsibility design pattern");
        logger.warn("testing chain of responsibility design pattern");
    }
}
