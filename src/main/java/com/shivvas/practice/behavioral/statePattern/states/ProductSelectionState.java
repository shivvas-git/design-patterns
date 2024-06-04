package com.shivvas.practice.behavioral.statePattern.states;

import com.shivvas.practice.behavioral.statePattern.Product;
import com.shivvas.practice.behavioral.statePattern.VendingMachine;

import java.util.Objects;

public class ProductSelectionState implements IState {
    @Override
    public void start(VendingMachine vendingMachine) {
        System.out.println("Invalid operation");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int coin) {
        System.out.println("Invalid operation");
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {
        System.out.println("Cancelling!!! Returning all inserted money");
        changeState(vendingMachine, new IdleState());
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productId) {
        System.out.println("Provide product code Id");
        Product selectedProduct = vendingMachine.getProduct(productId);
        if(Objects.isNull(selectedProduct)) {
            System.out.println("Product is not available");
            return;
        } else if(vendingMachine.getAmountInserted() < selectedProduct.getPrice()) {
            System.out.println("Not enough money");
            changeState(vendingMachine, new StartState());
            return;
        }
        vendingMachine.setSelectedProduct(selectedProduct);
        //check product price and provided money suffice the need.
        changeState(vendingMachine, new DispenseState());
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Invalid operation");
    }
}
