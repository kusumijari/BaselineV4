//Receives input and parses it

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

    public String extractString() {
        return input.substring(input.indexOf(" ")+1, input.indexOf(" at "));
    }
}
