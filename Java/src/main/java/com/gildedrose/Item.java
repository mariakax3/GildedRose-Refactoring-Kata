package com.gildedrose;

public class Item {

    private final String name;
    private int sellIn;
    private int quality;
    private final ItemType itemType;

    public Item(String name, int sellIn, int quality, ItemType itemType) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.itemType = itemType;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public ItemType getType() {
        return itemType;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
