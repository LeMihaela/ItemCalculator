package com.example.itemtool.Item_naloga.izpeljanjeSupport;

import com.example.itemtool.Item_naloga.Osnova.SupportItem;

public class Redemption extends SupportItem {
    public Redemption(){
        super();
        name="Redemption";
        AD=0;
        AP=0;
        HP=250;
        AbilityHaste=0;
        ManaRegen=100;
        HealAndShield=15;
        Effect="Intervention's effects are reduced by 50% if the target was affected by another Intervention in the last 12 seconds.";
    }
}
