package com.example.itemtool.Item_naloga.izpeljanjeMage;

import com.example.itemtool.Item_naloga.Osnova.MageItem;

public class LudensTempest extends MageItem {
    public LudensTempest(){
        super();
        name="Luden's Tempest";
        AD=0;
        AP=80;
        HP=0;
        Mana=600;
        AbilityHaste=20;
        Effect="Dealing ability damage to an enemy deals 100 (+ 10% AP) additional magic damage to them and launches orbs at up to 3 other enemies within Range center 600 units around them, impacting after 0.528 seconds to deal the same damage to each, and grants you 15% bonus movement speed for 2 seconds.";
    }
}
