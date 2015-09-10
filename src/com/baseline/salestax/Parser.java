//Receives input and parses it

package com.baseline.salestax;

public class Parser {
    private String input;

    public Parser(String input) {
        this.input = input;
    }

    public boolean containsBook() {
        if(!input.contains("book")){
            return false;
        }
        return true;
    }

    public boolean containsChocolate() {
        return input.contains("chocolate");
    }
}
