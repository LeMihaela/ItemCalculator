package com.example.itemtool.Item_naloga;
import java.util.List;
import java.util.List;
import java.util.stream.Collectors;

public class Item {
    protected String name;
    protected int AD;
    protected int AP;
    protected   int HP;
    protected String Effect;
    protected int AbilityHaste;
    protected int Health;
    public Item(String name, int AD, int AP, int HP, int AbilityHaste, String Effect){
        this.name=name;
        this.AD=AD;
        this.AP=AP;
        this.HP=HP;
        this.Health=Health;
        this.AbilityHaste=AbilityHaste;
        this.Effect=Effect;
    }
    public Item(){
        this.name="";
        this.AD=0;
        this.AP=0;
        this.HP=0;
        this.Health=0;
        this.AbilityHaste=0;
        this.Effect="";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAD() {
        return AD;
    }
    public int getAP() {
        return AP;
    }
    public int getHP() {
        return HP;
    }
    public void setAD(int AD) {
        this.AD = AD;
    }
    public void setAP(int AP) {
        this.AP = AP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    public int getHealth() {
        return Health;
    }
    public void setHealth(int health) {
        Health = health;
    }
    public String getEffect() {
        return Effect;
    }
    public void setEffect(String effect) {
        Effect = effect;
    }
    public int getAbilityHaste() {
        return AbilityHaste;
    }
    public void setAbilityHaste(int abilityHaste) {
        AbilityHaste = abilityHaste;
    }

}

