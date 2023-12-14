package com.example.itemtool.Item_naloga.izpeljanjeTank;

import com.example.itemtool.Item_naloga.Osnova.TankItem;

public class WarmogsArmor extends TankItem {
    public WarmogsArmor(){
        super();
        name="Warmog's Armor";
        AD=0;
        AP=0;
        HP=800;
        AbilityHaste=10;
        Armor=0;
        MR=0;
        Effect="Regenerate「 2.5% maximum health every 0.5 seconds 」if damage has not been taken in the last 6 seconds (3 seconds for damage from non-champions).";
    }
}
