package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20, ItemType.REGULAR),
            new Item("Aged Brie", 2, 0, ItemType.AGED_BRIE),
            new Item("Elixir of the Mongoose", 5, 7, ItemType.REGULAR),
            new Item("Sulfuras, Hand of Ragnaros", 0, 80, ItemType.SULFURAS),
            new Item("Sulfuras, Hand of Ragnaros", -1, 80, ItemType.SULFURAS),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20, ItemType.BACKSTAGE_PASSES),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49, ItemType.BACKSTAGE_PASSES),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49, ItemType.BACKSTAGE_PASSES),
            new Item("Conjured Mana Cake", 3, 6, ItemType.CONJURED)
        };

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }
}
