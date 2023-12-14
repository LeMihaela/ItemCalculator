package com.example.itemtool.Item_naloga.izpeljanjeTank;

import com.example.itemtool.Item_naloga.Osnova.TankItem;

public class JakShoTheProtean extends TankItem {
    public JakShoTheProtean(){
        super();
        AD=0;
        AP=0;
        HP=400;
        AbilityHaste=20;
        Armor=30;
        MR=30;
        Effect="For each second in combat with champions, gain 2 bonus armor and bonus magic resistance for 6 seconds, stacking up to 8 times for a total of 16 bonus resistances. Upon reaching maximum stacks, instantly deal 80 (+ 7% bonus health) magic damage to enemy champions within 700 units and Heal power icon heal for the same amount for each target damaged. You then increase your bonus resistances by 20% until the end of combat.";
    }
}
