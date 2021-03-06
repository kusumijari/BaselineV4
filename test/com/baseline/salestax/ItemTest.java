package com.baseline.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void shouldCalculateSalesTaxForItemThatIsFoodBookMedicineAndNotImported() {
        Item item = new Item(1, "book", 12.49, true, false);

        assertEquals(12.49, item.salesTax(), 0.0005);
    }

    @Test
    public void shouldCalculateSalesTaxForItemThatIsNotFoodBookMedicineAndNotImported() {
        Item item = new Item(1, "music CD", 14.99, false, false);

        assertEquals(16.489, item.salesTax(), 0.0005);
    }

}