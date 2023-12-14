package com.example.itemtool.Item_naloga.Osnova;
import com.example.itemtool.Item_naloga.Item;
//Načrt za Tank iteme
public class TankItem extends Item {
    public TankItem() {
        super();
    }
    protected int Armor;
    protected int MR;

    public int getArmor() {
        return Armor;
    }

    public int getMR() {
        return MR;
    }
    @Override
    public String toString() {
        return("Item has:" + AD + " ad," + AP + " ap," + HP + " hp," + AbilityHaste + " ah," + Armor + " armor," + MR + "magic resist");
    }
}
