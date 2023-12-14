package com.example.itemtool.Item_naloga.izpeljanjeMarksman;

import com.example.itemtool.Item_naloga.Osnova.MarksmanItem;
//dedovanje iz Marksman itema
public class KrakenSlayer extends MarksmanItem {
    public KrakenSlayer(){
        super();
        name="Kraken Slayer";
        AD=40;
        AP=0;
        HP=0;
        AbilityHaste=0;
        CriticalStrike=20;
        LifeSteal=0;
        AttackSpeed=30;
        Effect="Basic attacks (Melee role on-hit / Ranged role on-attack) grant a stack for 3 seconds, up to 2 stacks. At 2 stacks, the next basic attack consumes all stacks to deal 35 − 85 (based on level) (+ 65% AD) (+ 60% AP) bonus physical damage on-hit. Consuming stacks on the same target within 6 seconds increases the damage by 50%, up to 100%.";
    }

}
