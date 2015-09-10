//Item has quantity, name, price and type using which it calculates sales tax

package com.baseline.salestax;

public class Item {
    private int quantity;
    private String name;
    private Double price;
    private boolean isBookFoodMedicine;
    private boolean isImported;

    public Item(int quantity, String name, Double price, Boolean isBookFoodMedicine, Boolean isImported) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.isBookFoodMedicine = isBookFoodMedicine;
        this.isImported = isImported;
    }

    public double salesTax() {
        if(isBookFoodMedicine) {
            if(!isImported) {
                return price;
            }
        }

        return 16.489;
    }
}
