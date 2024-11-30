package com.gildedrose.updaters;

import com.gildedrose.Item;

public class SulfurasUpdater implements QualityUpdater {
    @Override
    public void updateQuality(Item item) {
        // Sulfuras never changes in quality or sellIn
        // No operation is needed here.
    }
}
