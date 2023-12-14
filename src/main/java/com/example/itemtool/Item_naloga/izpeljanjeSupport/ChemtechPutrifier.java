package com.example.itemtool.Item_naloga.izpeljanjeSupport;

import com.example.itemtool.Item_naloga.Osnova.SupportItem;
//dedovanje iz Support itema
public class ChemtechPutrifier extends SupportItem {
    public ChemtechPutrifier(){
        super();
        name="Chemtech Putrifier";
        AD=0;
        AP=35;
        HP=0;
        AbilityHaste=15;
        ManaRegen=75;
        HealAndShield=10;
        Effect="Dealing damage to enemy champions inflicts them with Grievous Wounds icon Grievous Wounds for 3 seconds.";
    }
}
