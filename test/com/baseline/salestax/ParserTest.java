package com.baseline.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
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

    @Test
    public void shouldReturnTrueIfInputContainsImported() {
        Parser parser = new Parser("imported book");

        assertTrue(parser.containsImported());
    }

    @Test
    public void shouldReturnFalseIfInputDoesNotContainImported() {
        Parser parser = new Parser("book");

        assertFalse(parser.containsImported());
    }

    @Test
    public void shouldExtractQuantityFromTheInputString() {
        Parser parser = new Parser("1 book");

        assertEquals(1, parser.extractQuantity());
    }

    @Test
    public void shouldExtractItemNameFromTheInputStringContainingBook() {
        Parser parser = new Parser("1 book at 12.49");

        assertEquals("book", parser.extractName());
    }

    @Test
    public void shouldExtractItemNameFromTheInputStringContainingPill() {
        Parser parser = new Parser("1 packet of headache pills at 9.75");

        assertEquals("packet of headache pills", parser.extractName());
    }

    @Test
    public void shouldExtractPriceFromInputOfPrice12() {
        Parser parser = new Parser("1 book at 12.49");

        assertEquals(12.49, parser.extractPrice(), 0.05);
    }

    @Test
    public void shouldExtractPriceFromInputOfPrice9() {
        Parser parser = new Parser("1 book at 9.75");

        assertEquals(9.75, parser.extractPrice(), 0.05);
    }
}