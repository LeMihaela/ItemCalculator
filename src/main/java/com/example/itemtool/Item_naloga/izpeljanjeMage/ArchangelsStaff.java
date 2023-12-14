package com.example.itemtool.Item_naloga.izpeljanjeMage;

import com.example.itemtool.Item_naloga.Osnova.MageItem;
//dedovanje iz Mage itema
public class ArchangelsStaff extends MageItem {
    public ArchangelsStaff(){
        super();
        name="Archangel's Staff";
        AD=0;
        AP=70;
        HP=200;
        Mana=500;
        AbilityHaste=10;
        Effect="Grants a charge every 8 seconds, up to 4 charges. Affecting an enemy or ally with an ability consumes a charge to grant 3 bonus mana, increased to 6 if they are a champion, up to a maximum of 360 bonus mana.";
    }
}
