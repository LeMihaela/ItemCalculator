package com.example.itemtool.Item_naloga;

import java.util.List;

public class ItemSummer {
    public static int sumItems(List<Item> items) {
        return items.stream()
                .mapToInt(item -> item.getAD() + item.getAP() + item.getHP() + item.getHealth() + item.getAbilityHaste())
                .sum();
    }
}
