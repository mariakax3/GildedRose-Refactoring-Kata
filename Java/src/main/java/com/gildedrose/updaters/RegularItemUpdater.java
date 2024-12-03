package com.gildedrose.updaters;

import com.gildedrose.Item;

public class RegularItemUpdater implements QualityUpdater {

    @Override
    public void updateQuality(Item item) {

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            decreaseQuality(item, 2*DEFAULT_QUALITY_CHANGE);
        } else {
            decreaseQuality(item, DEFAULT_QUALITY_CHANGE);
        }
    }
}
