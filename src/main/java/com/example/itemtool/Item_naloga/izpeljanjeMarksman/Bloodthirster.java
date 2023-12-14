package com.example.itemtool.Item_naloga.izpeljanjeMarksman;

import com.example.itemtool.Item_naloga.Osnova.MarksmanItem;

public class Bloodthirster extends MarksmanItem {
    public Bloodthirster(){
        super();
        name="Bloodthirster";
        AD=55;
        AP=0;
        HP=0;
        AbilityHaste=0;
        CriticalStrike=0;
        LifeSteal=18;
        Effect="While above 70% maximum health, gain 10 − 40 (based on level) bonus attack damage.";
    }
}
