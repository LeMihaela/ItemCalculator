package com.example.itemtool.Item_naloga.izpeljanjeTank;

import com.example.itemtool.Item_naloga.Osnova.TankItem;

public class Thornmail extends TankItem {
    public Thornmail(){
        super();
        name="Thornmail";
        AD=0;
        AP=0;
        HP=350;
        AbilityHaste=0;
        Armor=70;
        MR=0;
        Effect="When struck by a basic attack on-hit, deal 10 (+ 25% bonus armor) magic damage to the attacker and, if they are a champion, inflict them with Grievous Wounds icon Grievous Wounds for 3 seconds.";
    }
}
