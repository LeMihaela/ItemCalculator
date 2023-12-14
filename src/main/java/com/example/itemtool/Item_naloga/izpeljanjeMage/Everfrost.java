package com.example.itemtool.Item_naloga.izpeljanjeMage;

import com.example.itemtool.Item_naloga.Osnova.MageItem;
//dedovanje iz Mage itema
public class Everfrost extends MageItem {
    public Everfrost(){
        super();
        name="Everfrost";
        AD=0;
        AP=70;
        HP=250;
        Mana=600;
        AbilityHaste=20;
        Effect="Deal 100 (+30%) magic damage in a cone, slowing enemies by 65% for 1.5 seconds. Enemies in the center of the cone are rooted for the same duration instead (30 seconds).";
    }
}
