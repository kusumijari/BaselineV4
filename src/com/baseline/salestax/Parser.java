//Receives input and parses it

package com.baseline.salestax;

public class Parser {
    private String input;

    public Parser(String input) {
        this.input = input;
    }

    public boolean containsBook() {
        return input.contains("book");
    }

    public boolean containsChocolate() {
        return input.contains("chocolate");
    }
}
