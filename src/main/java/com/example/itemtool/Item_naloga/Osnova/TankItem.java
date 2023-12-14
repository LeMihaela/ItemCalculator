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
}
