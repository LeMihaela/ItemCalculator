package com.example.itemtool.Item_naloga;

import java.util.List;

public class ItemSum {
    public static int sumItems(List<Item> items) {
        int sum = 0;
        for (Item item : items) {
            sum += item.getAD();
            sum += item.getAP();
            sum += item.getHP();
            sum += item.getHealth();
            sum += item.getAbilityHaste();
        }
        return sum;
    }
}
