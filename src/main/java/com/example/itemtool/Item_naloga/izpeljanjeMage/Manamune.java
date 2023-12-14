package com.example.itemtool.Item_naloga.izpeljanjeMage;

import com.example.itemtool.Item_naloga.Osnova.MageItem;

public class Manamune extends MageItem {
    public Manamune(){
        super();
        AD=35;
        AP=0;
        HP=0;
        Mana=500;
        AbilityHaste=15;
        Effect="Grants a charge every 8 seconds, up to 4 charges. Consumes a charge on-hit and whenever affecting an enemy or ally with an ability to grant 3 bonus mana, increased to 6 for champion targets, up to a maximum of 360 bonus mana.";
    }
}
