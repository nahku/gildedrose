package com.gildedrose;

import org.junit.jupiter.api.Test;

import static com.gildedrose.GildedRoseItem.gildedRoseItem;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredItemTest {
    @Test
    public void degradesTwiceAsFastAsNormalItems() {
        Item c = new Item("Conjured Mana Cake", 10, 10);
        GildedRoseItem conjured = gildedRoseItem(c);

        assertEquals(10, c.quality);
        conjured.updateQuality();
        assertEquals(8, c.quality);
        conjured.updateQuality();
        assertEquals(6, c.quality);
        conjured.updateQuality();
        assertEquals(4, c.quality);
        conjured.updateQuality();
        assertEquals(2, c.quality);
        conjured.updateQuality();
        assertEquals(0, c.quality);
        conjured.updateQuality();
        assertEquals(0, c.quality);
    }
}
