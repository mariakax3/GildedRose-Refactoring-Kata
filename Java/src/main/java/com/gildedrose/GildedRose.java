package com.gildedrose;

import com.gildedrose.updaters.*;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            QualityUpdater updater = UpdaterStrategyFactory.find(item.getType());
            updater.updateQuality(item);
        }
    }
}
