package com.example.itemtool.Item_naloga.Osnova;
import com.example.itemtool.Item_naloga.Item;
//Načrt za Support iteme
public class SupportItem extends Item {
    public SupportItem(){
       super();
    }
    protected int ManaRegen;
    protected int HealAndShield;

    public int getHealAndShield() {
        return HealAndShield;
    }

    public int getManaRegen() {
        return ManaRegen;
    }
    @Override
    public String toString() {
        return("Item has:" + AD + " ad," + AP + " ap," + HP + " hp," + AbilityHaste + " ah," + HealAndShield + " Heal and Sheild," + ManaRegen + "mana reg.");
    }
}
