package com.linkedinlearning.challenges.gildedrose;

public class GildedRoseV2 extends GildedRose {

  public GildedRoseV2(Item[] items) {
    super(items);
  }

  public void updateQuality() {
    super.updateQuality();

    for (int i = 0; i < items.length; i++) {

      if (items[i].name.equals("Aged Brie")) {
        if (items[i].quality > 50) {
          items[i].quality = 50;
        }
      }

      if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
        if (items[i].sellIn < 0) {
          items[i].sellIn = 0;
        }
      }

      if (items[i].quality < 0) {
        items[i].quality = 0;
      }

    }

  }

}
