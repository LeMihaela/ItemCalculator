package com.example.itemtool.Item_naloga.izpeljanjeMarksman;

import com.example.itemtool.Item_naloga.Osnova.MarksmanItem;

public class StatikkShiv extends MarksmanItem {
    public StatikkShiv(){
        super();
        AD=50;
        AP=0;
        HP=0;
        AbilityHaste=0;
        CriticalStrike=20;
        LifeSteal=0;
        AttackSpeed=30;
        Effect="When fully Kircheis Shard item Energized, your next basic attack deals 100 − 180 (based on level) (+ 15% AP) bonus magic damage, modified to 150 against minions. Energized attacks bounce their additional effect to the closest target within 500 units, repeating from the new target to strike up to 6 / 9 / 12 (based on level) targets.";
    }
}
