package com.example.itemtool.Item_naloga.Osnova;
import com.example.itemtool.Item_naloga.Item;
//Načrt za Marksman iteme
public class MarksmanItem extends Item {
    public MarksmanItem(){
        super();
    }
    protected int CriticalStrike;
    protected int LifeSteal;
    protected int AttackSpeed;

    public int getAttackSpeed() {
        return AttackSpeed;
    }

    public int getCriticalStrike() {
        return CriticalStrike;
    }

    public int getLifeSteal() {
        return LifeSteal;
    }
}
