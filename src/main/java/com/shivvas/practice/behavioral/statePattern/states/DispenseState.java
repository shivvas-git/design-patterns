package com.shivvas.practice.behavioral.statePattern.states;

import com.shivvas.practice.behavioral.statePattern.Product;
import com.shivvas.practice.behavioral.statePattern.VendingMachine;

public class DispenseState implements IState {

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
        System.out.println("Invalid operation");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productId) {
        System.out.println("Invalid operation");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        Product selectedProduct = vendingMachine.getSelectedProduct();
        Integer currentQuantity = vendingMachine.getProductQuantity(selectedProduct);
        System.out.println("Product dispensing: " + selectedProduct.getName());
        vendingMachine.updateProductQuantity(selectedProduct, currentQuantity - 1);
        changeState(vendingMachine, new IdleState());
    }
}
