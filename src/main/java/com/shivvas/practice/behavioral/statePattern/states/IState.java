package com.shivvas.practice.behavioral.statePattern.states;

import com.shivvas.practice.behavioral.statePattern.VendingMachine;

public interface IState {


    void start(VendingMachine vendingMachine);
    void insertCoin(VendingMachine vendingMachine, int coin);

    void cancelTransaction(VendingMachine vendingMachine);

    void selectProduct(VendingMachine vendingMachine, int productId);

    void dispenseProduct(VendingMachine vendingMachine);

    default void changeState(VendingMachine vendingMachine, IState state) {
        vendingMachine.setState(state);
    }

}
