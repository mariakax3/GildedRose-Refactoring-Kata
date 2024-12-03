package com.gildedrose.updaters;

import com.gildedrose.ItemType;
import com.gildedrose.updaters.*;

import java.util.EnumMap;

import static com.gildedrose.ItemType.*;

public class UpdaterStrategyFactory {

    private static final QualityUpdater REGULAR_QUALITY_UPDATER = new RegularItemUpdater();

    private static final EnumMap<ItemType, QualityUpdater> qualityUpdaters;
    static {
        qualityUpdaters = new EnumMap<>(ItemType.class);
        qualityUpdaters.put(REGULAR, REGULAR_QUALITY_UPDATER);
        qualityUpdaters.put(AGED_BRIE, new AgedBrieUpdater());
        qualityUpdaters.put(BACKSTAGE_PASSES, new BackstagePassUpdater());
        qualityUpdaters.put(CONJURED, new ConjuredItemUpdater());
        qualityUpdaters.put(SULFURAS, new SulfurasUpdater());
    }

    private UpdaterStrategyFactory() {

    }

    public static QualityUpdater find(ItemType type) {
        return qualityUpdaters.getOrDefault(type, REGULAR_QUALITY_UPDATER);
    }
}
