package com.example.itemtool.Item_naloga.izpeljanjeMarksman;

import com.example.itemtool.Item_naloga.Osnova.MarksmanItem;
//dedovanje iz Marksman itema
public class PhantomDancer extends MarksmanItem {
    public PhantomDancer(){
        super();
        name="Phantom Dancer";
        AD=20;
        AP=0;
        HP=0;
        AbilityHaste=0;
        CriticalStrike=20;
        LifeSteal=0;
        AttackSpeed=35;
        Effect="Basic attacks on-attack grant Ghost ghosting, 7% bonus movement speed, and a stack of Spectral Waltz for 3 seconds, up to 4 stacks. While at 4 stacks, gain 30% bonus attack speed.";
    }
}
