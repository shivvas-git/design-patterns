package com.shivvas.practice.behavioral.statePattern;

import com.shivvas.practice.behavioral.statePattern.states.IState;
import com.shivvas.practice.behavioral.statePattern.states.IdleState;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachine {

    private IState state;

    private Integer amountInserted;

    private Product selectedProduct;

    private final Map<Product, Integer> productQuantity;

    public VendingMachine() {
        this.state = new IdleState();
        amountInserted = 0;
        Product p1 = new Product("Chips", 123, 20, 1, 1);
        Product p2 = new Product("Cold drink", 121, 40, 1, 2);
        Product p3 = new Product("Chocolate", 111, 30, 1, 3);
        productQuantity = new HashMap<>();
        productQuantity.put(p1,5);
        productQuantity.put(p2,10);
        productQuantity.put(p3,5);
        selectedProduct = null;
    }

    public void startMachine() {

        this.state.start(this);

        this.state.insertCoin(this, 20);

        this.state.selectProduct(this, 123);

        this.state.dispenseProduct(this);

    }

    public void setState(IState state) {
        this.state = state;
    }

    public void setAmountInserted(int amount) {
        this.amountInserted = amount;
    }

    public int getAmountInserted() {
        return this.amountInserted;
    }

    public List<Product> getProducts() {
        return productQuantity.entrySet().stream()
                .filter(productIntegerEntry -> productIntegerEntry.getValue() > 0)
                .map(Map.Entry::getKey)
                .toList();
    }

    public Integer getProductQuantity(Product product) {
        try {
            return Math.max(0, productQuantity.get(product));
        } catch (Exception e) {
            return 0;
        }
    }

    public void updateProductQuantity(Product product, Integer quantity) {
        productQuantity.put(product, quantity);
    }

    public Product getProduct(Integer id) {
        List<Product> productList = getProducts();
        return productList.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public Product getSelectedProduct() {
        return this.selectedProduct;
    }
}
