package com.example.itemtool.Item_naloga.Osnova;

import com.example.itemtool.Item_naloga.Item;
//Načrt za Assassin iteme
public class AssassinItem extends Item {
    public AssassinItem(){
        super();
    }
    protected int Lethality;

    public int getLethality() {
        return Lethality;
    }

    @Override
    public String toString() {
        return("Item has:" + AD + " ad," + AP + " ap," + HP + " hp," + AbilityHaste + " ah," + Lethality + "lethality");
    }
}
