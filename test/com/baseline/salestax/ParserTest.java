package com.baseline.salestax;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParserTest {
    @Test
    public void shouldReturnTrueIfInputContainsBook() {
        Parser parser = new Parser("book");

        assertTrue(parser.containsBook());
    }
}