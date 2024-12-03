package com.gildedrose.updaters;

import com.gildedrose.Item;

public interface QualityUpdater {
    Integer MAX_QUALITY = 50;
    Integer MIN_QUALITY = 0;
    Integer DEFAULT_QUALITY_CHANGE = 1;

    void updateQuality(Item item);

    default void increaseQuality(Item item, Integer value){
        item.setQuality(Integer.min(item.getQuality() + value, MAX_QUALITY));
    }

    default void decreaseQuality(Item item, Integer value){
        item.setQuality(Integer.max(item.getQuality() - value, MIN_QUALITY));
    }
}
