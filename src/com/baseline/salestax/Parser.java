//Receives input and parses it

package com.baseline.salestax;

public class Parser {
    private String input;

    private Parser(String input) {
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

    public boolean containsBookOrPillOrMedicine() {
        return ((containsBook() || containsPill() || containsChocolate()));
    }
}
