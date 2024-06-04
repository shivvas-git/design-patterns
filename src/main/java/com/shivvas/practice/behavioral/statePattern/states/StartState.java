package com.shivvas.practice.behavioral.statePattern.states;

import com.shivvas.practice.behavioral.statePattern.VendingMachine;

public class StartState implements IState {

    @Override
    public void start(VendingMachine vendingMachine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int coin) {
        System.out.println("Inserting coins");
        vendingMachine.setAmountInserted(coin);
        changeState(vendingMachine, new ProductSelectionState());
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {
        System.out.println("Cancelling the transaction");
        changeState(vendingMachine, new IdleState());
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
