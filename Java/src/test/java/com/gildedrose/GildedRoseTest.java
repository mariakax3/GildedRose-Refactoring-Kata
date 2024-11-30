package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void testUpdateQualityForRegularItem() {
        Item[] items = new Item[] { new Item("foo", 0, 0, ItemType.REGULAR) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(0, app.items[0].getQuality());
        assertEquals(-1, app.items[0].getSellIn());
    }

    @Test
    void testUpdateQualityForAgedBrie() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 0, ItemType.AGED_BRIE) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(1, app.items[0].getQuality());
        assertEquals(1, app.items[0].getSellIn());
    }

    @Test
    void testUpdateQualityForConjuredItem() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 3, 6, ItemType.CONJURED) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(4, app.items[0].getQuality());
        assertEquals(2, app.items[0].getSellIn());
    }

    @Test
    void testUpdateQualityForSulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 80, ItemType.SULFURAS) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(80, app.items[0].getQuality());
        assertEquals(0, app.items[0].getSellIn());
    }

    @Test
    void testUpdateQualityForBackstagePasses() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20, ItemType.BACKSTAGE_PASSES) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(21, app.items[0].getQuality());
        assertEquals(14, app.items[0].getSellIn());
    }
}
