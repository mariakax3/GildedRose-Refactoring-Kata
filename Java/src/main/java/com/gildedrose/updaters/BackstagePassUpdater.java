package com.gildedrose.updaters;

import com.gildedrose.Item;

public class BackstagePassUpdater implements QualityUpdater {
    private static Integer LESS_THEN_TEN_DAYS_QUALITY_CHANGE = 2;
    private static Integer LESS_THEN_FIVE_DAYS_QUALITY_CHANGE = 3;

    @Override
    public void updateQuality(Item item) {

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            item.setQuality(MIN_QUALITY);
        } else if (item.getSellIn() <= 5 ) {
            increaseQuality(item, LESS_THEN_FIVE_DAYS_QUALITY_CHANGE);
        } else if (item.getSellIn() <= 10) {
            increaseQuality(item, LESS_THEN_TEN_DAYS_QUALITY_CHANGE);
        } else {
            increaseQuality(item, DEFAULT_QUALITY_CHANGE);
        }
    }
}
