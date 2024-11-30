package com.gildedrose.updaters;

import com.gildedrose.Item;

public class BackstagePassUpdater implements QualityUpdater {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);

            if (item.getSellIn() < 11 && (item.getQuality() < 50)) {
                item.setQuality(item.getQuality() + 1);
            }

            if (item.getSellIn() < 6 && (item.getQuality() < 50)) {
                item.setQuality(item.getQuality() + 1);
            }
        }

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
    }
}
