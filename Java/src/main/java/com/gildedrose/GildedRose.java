package com.gildedrose;

import com.gildedrose.updaters.AgedBrieUpdater;
import com.gildedrose.updaters.BackstagePassUpdater;
import com.gildedrose.updaters.ConjuredItemUpdater;
import com.gildedrose.updaters.QualityUpdater;
import com.gildedrose.updaters.RegularItemUpdater;
import com.gildedrose.updaters.SulfurasUpdater;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            QualityUpdater updater = getUpdaterForItem(item);
            updater.updateQuality(item);
        }
    }

    private QualityUpdater getUpdaterForItem(Item item) {
        switch (item.getType()) {
            case AGED_BRIE:
                return new AgedBrieUpdater();
            case BACKSTAGE_PASSES:
                return new BackstagePassUpdater();
            case SULFURAS:
                return new SulfurasUpdater();
            case CONJURED:
                return new ConjuredItemUpdater();
            default:
                return new RegularItemUpdater();
        }
    }
}
