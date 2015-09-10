//Receives input and parses it to create an item object

package com.baseline.salestax;

public class Parser {
    private String input;

    public Parser(String input) {
        this.input = input;
    }

    private boolean containsBook() {
        return input.contains("book");
    }

    private boolean containsChocolate() {
        return input.contains("chocolate");
    }

    private boolean containsPill() {
        return input.contains("pill");
    }

    public boolean containsBookOrPillOrChocolate() {
        return ((containsBook() || containsPill() || containsChocolate()));
    }

    public boolean containsImported() {
        return input.contains("imported");
    }

    public int extractQuantity() {
        return Integer.parseInt(input.split(" ")[0]);
    }

    public String extractName() {
        return input.substring(input.indexOf(" ") + 1, input.indexOf(" at "));
    }

    public double extractPrice() {
        return Double.parseDouble(input.substring(input.indexOf(" at ") + 4));
    }

    public Item createItem() {
        return new Item(extractQuantity(), extractName(), extractPrice(), containsBookOrPillOrChocolate(), containsImported());
    }
}
