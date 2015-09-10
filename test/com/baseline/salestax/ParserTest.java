package com.baseline.salestax;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParserTest {

    @Test
    public void shouldReturnTrueIfInputContainsBook() {
        Parser parser = new Parser("book");

        assertTrue(parser.containsBookOrPillOrChocolate());
    }

    @Test
    public void shouldReturnFalseIfInputDoesNotContainABook() {
        Parser parser = new Parser("medicine");

        assertFalse(parser.containsBookOrPillOrChocolate());
    }

    @Test
    public void shouldReturnTrueIfInputContainsChocolate() {
        Parser parser = new Parser("chocolate");

        assertTrue(parser.containsBookOrPillOrChocolate());
    }

    @Test
    public void shouldReturnFalseIfInputDoesNotContainChocolate() {
        Parser parser = new Parser("medicine");

        assertFalse(parser.containsBookOrPillOrChocolate());
    }

    @Test
    public void shouldReturnTrueIfInputContainsPill() {
        Parser parser = new Parser("pill");

        assertTrue(parser.containsBookOrPillOrChocolate());
    }

    @Test
    public void shouldReturnFalseIfInputDoesNotContainPill() {
        Parser parser = new Parser("medicine");

        assertFalse(parser.containsBookOrPillOrChocolate());
    }

    @Test
    public void shouldReturnTrueIfInputContainsBookOrPillOrChocholate() {
        Parser parser = new Parser("pill");

        assertTrue(parser.containsBookOrPillOrChocolate());
    }

    @Test
    public void shouldReturnFalseIfInputDoesNotContainBookOrPillOrChocholate() {
        Parser parser = new Parser("perfume");

        assertFalse(parser.containsBookOrPillOrChocolate());
    }
}