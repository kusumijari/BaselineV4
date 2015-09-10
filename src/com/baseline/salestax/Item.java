//Item has quantity, name, price  using which it calculates sales tax

package com.baseline.salestax;

public class Item {
    private int quantity;
    private String name;
    private Double price;

    public Item(int quantity, String name, Double price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

}
