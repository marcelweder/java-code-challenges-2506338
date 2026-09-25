package com.linkedinlearning.challenges.gildedrose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GildedRoseV2Test {

  @Test
  public void anySellInNegative() {
    Item[] items = new Item[] { new Item("Irgendwas", -1, 10) };

    GildedRoseV2 app = new GildedRoseV2(items);
    app.updateQuality();

    Assertions.assertEquals("Irgendwas", items[0].name);
    Assertions.assertEquals(-2, items[0].sellIn);
    Assertions.assertEquals(8, items[0].quality);
  }

  @Test
  public void anyQualityNegative() {
    Item[] items = new Item[] { new Item("Irgendwas", 50, -1) };

    GildedRoseV2 app = new GildedRoseV2(items);
    app.updateQuality();

    Assertions.assertEquals("Irgendwas", items[0].name);
    Assertions.assertEquals(49, items[0].sellIn);
    Assertions.assertEquals(0, items[0].quality);
  }

  @Test
  public void agedBrieDefault() {
    Item[] items = new Item[] { new Item("Aged Brie", 100, 20) };

    GildedRoseV2 app = new GildedRoseV2(items);
    app.updateQuality();

    Assertions.assertEquals("Aged Brie", items[0].name);
    Assertions.assertEquals(99, items[0].sellIn);
    Assertions.assertEquals(21, items[0].quality);
  }

  @Test
  public void agedBrieMax() {
    Item[] items = new Item[] { new Item("Aged Brie", 100, 56) };

    GildedRoseV2 app = new GildedRoseV2(items);
    app.updateQuality();

    Assertions.assertEquals("Aged Brie", items[0].name);
    Assertions.assertEquals(99, items[0].sellIn);
    Assertions.assertEquals(50, items[0].quality);
  }

  @Test
  public void sulfurasNeverSellIn() {
    Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -1, 80) };

    GildedRoseV2 app = new GildedRoseV2(items);
    app.updateQuality();

    Assertions.assertEquals("Sulfuras, Hand of Ragnaros", items[0].name);
    Assertions.assertEquals(0, items[0].sellIn);
    Assertions.assertEquals(80, items[0].quality);
  }

  @Test
  public void backStagePass10Days() {
    Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20) };

    GildedRoseV2 app = new GildedRoseV2(items);
    app.updateQuality();

    Assertions.assertEquals("Backstage passes to a TAFKAL80ETC concert", items[0].name);
    Assertions.assertEquals(9, items[0].sellIn);
    Assertions.assertEquals(22, items[0].quality);
  }

}
