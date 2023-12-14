package com.example.itemtool.Item_naloga.Osnova;
import com.example.itemtool.Item_naloga.Item;
import com.example.itemtool.Item_naloga.Item;
//Načrt za Mage iteme
public class MageItem extends Item {
    public MageItem(){
        super();
    }
    protected int Mana;

    public int getMana() {
        return Mana;
    }

    @Override
    public String toString() {
        return("Item has:" + AD + " ad," + AP + " ap," + HP + " hp," + AbilityHaste + " ah," + Mana + "mana");
    }
}
