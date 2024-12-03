package com.gildedrose.updaters;

import com.gildedrose.Item;

public class ConjuredItemUpdater implements QualityUpdater {
    private static Integer CONJURED_QUALITY_CHANGE = 2*DEFAULT_QUALITY_CHANGE;

    @Override
    public void updateQuality(Item item) {

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0 ) {
           decreaseQuality(item, 2*CONJURED_QUALITY_CHANGE);
        } else {
            decreaseQuality(item, CONJURED_QUALITY_CHANGE);
        }
    }
}
