package com.example.itemtool.Item_naloga.izpeljanjeTank;

import com.example.itemtool.Item_naloga.Osnova.TankItem;

public class Heartsteel extends TankItem {
    public Heartsteel(){
        super();
        name="Heartsteel";
        AD=0;
        AP=0;
        HP=800;
        AbilityHaste=20;
        Armor=0;
        MR=0;
        Effect="While within 700 units of an enemy champion, generate a stack on them each second, stacking up to 3 times. Your next basic attack against a target with 3 stacks is empowered to consume them all to deal 125 (+ 6% maximum health) bonus physical damage on-hit and grant you permanent bonus health equal to「 10% of that amount 」 (30 (per target) second cooldown).";
    }
}
