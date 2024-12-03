package com.gildedrose.updaters;

import com.gildedrose.Item;

public class AgedBrieUpdater implements QualityUpdater {
    @Override
    public void updateQuality(Item item) {

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            increaseQuality(item, 2*DEFAULT_QUALITY_CHANGE);
        } else {
            increaseQuality(item, DEFAULT_QUALITY_CHANGE);
        }
    }
}
