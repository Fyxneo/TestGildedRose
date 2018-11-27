package edu.insightr.gildedrose;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    protected Inventory inv;
    Item[] ancienneListeDesItems;

    @BeforeEach
    public void setUp() {

        inv = new Inventory();
        ancienneListeDesItems = inv.getItems();
    }

    @AfterEach
    void tearDown() { }

    @Test
    public void testupdateQualityWhenSellInFinished() throws Exception {

        inv.updateQuality();
        Item[] items = inv.getItems();
        for(int i = 0; i < items.length; i++)
        {
            if(ancienneListeDesItems[i].getSellIn() == 0)
            {
                assertEquals(ancienneListeDesItems[i].getQuality() - 2, items[i].getQuality());
            }
        }
    }
}