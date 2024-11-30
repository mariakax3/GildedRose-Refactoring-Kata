package com.gildedrose.updaters;

import com.gildedrose.Item;

public class ConjuredItemUpdater implements QualityUpdater {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(Integer.max(item.getQuality() - 2, 0));
        }

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0 && item.getQuality() > 0) {
            item.setQuality(Integer.max(item.getQuality() - 2, 0));
        }
    }
}
