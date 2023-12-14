package com.example.itemtool.Item_naloga.izpeljanjeMage;

import com.example.itemtool.Item_naloga.Osnova.MageItem;
//dedovanje iz Mage itema
public class BansheesVeil extends MageItem {
    public BansheesVeil(){
        super();
        name="Banshee's Veil";
        AD=0;
        AP=80;
        HP=0;
        Mana=0;
        AbilityHaste=10;
        Effect="Grants a Spell Shield spell shield that blocks the next hostile ability (40 (restarts upon taking damage from champions) second cooldown).";
    }
}
