package com.shivvas.practice.behavioral.statePattern.states;

import com.shivvas.practice.behavioral.statePattern.VendingMachine;

public class IdleState implements IState {
    @Override
    public void start(VendingMachine vendingMachine) {
        System.out.println("Please start inserting coins");
        changeState(vendingMachine, new StartState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int coin) {
        System.out.println("Invalid operation");
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productId) {
        System.out.println("Invalid operation");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Invalid operation");
    }
}
