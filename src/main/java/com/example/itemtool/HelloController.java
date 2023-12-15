package com.example.itemtool;

import com.example.itemtool.Item_naloga.Item;
import com.example.itemtool.Item_naloga.Osnova.*;
import com.example.itemtool.Item_naloga.izpeljanjeAssassin.*;
import com.example.itemtool.Item_naloga.izpeljanjeMage.*;
import com.example.itemtool.Item_naloga.izpeljanjeMarksman.*;
import com.example.itemtool.Item_naloga.izpeljanjeSupport.*;
import com.example.itemtool.Item_naloga.izpeljanjeTank.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

import java.util.ArrayList;

public class HelloController {
    ArrayList<Item>itemList;

    @FXML
    private MenuButton menuButton1;
    @FXML
    private MenuButton menuButton2;
    @FXML
    private MenuButton menuButton3;
    @FXML
    private MenuButton menuButton4;
    @FXML
    private MenuButton menuButton5;
    @FXML
    private MenuButton menuButton6;

    String[] selected;
    @FXML
    private Label welcomeText;

    public HelloController(){
        selected = new String[6];
        itemList = new ArrayList<Item>();
        itemList.add(new AxiomArc());
        itemList.add(new DuskbladeofDraktharr());
        itemList.add(new Eclipse());
        itemList.add(new EdgeOfNight());
        itemList.add(new ProwlersClaw());
        itemList.add(new ArchangelsStaff());
        itemList.add(new BansheesVeil());
        itemList.add(new Everfrost());
        itemList.add(new LiandrysAnguish());
        itemList.add(new LudensTempest());
        itemList.add(new Bloodthirster());
        itemList.add(new EssenceReaver());
        itemList.add(new KrakenSlayer());
        itemList.add(new PhantomDancer());
        itemList.add(new RapidFirecannon());
        itemList.add(new ArdentCenser());
        itemList.add(new ChemtechPutrifier());
        itemList.add(new MoonstoneRenewer());
        itemList.add(new Redemption());
        itemList.add(new StaffofFlowingWater());
        itemList.add(new ForceofNature());
        itemList.add(new Heartsteel());
        itemList.add(new JakShoTheProtean());
        itemList.add(new Thornmail());
        itemList.add(new WarmogsArmor());
    }

    @FXML
    private void menuClick(ActionEvent event) {
        // Handle the menu item click event here
        if (event.getSource() instanceof MenuItem) {
            MenuItem clickedItemID = (MenuItem) event.getSource();
            MenuItem clickedItemName = (MenuItem) event.getTarget();
            String itemName = clickedItemName.getText();
            String dropDownID = clickedItemID.getParentPopup().getOwnerNode().getId();
            if(dropDownID.equals("menu1")){
                selected[0]=clickedItemName.getText();
                menuButton1.setText(itemName);
            }
            if(dropDownID.equals("menu2")){
                selected[1]=clickedItemName.getText();
                menuButton2.setText(itemName);
            }
            if(dropDownID.equals("menu3")){
                selected[2]=clickedItemName.getText();
                menuButton3.setText(itemName);
            }
            if(dropDownID.equals("menu4")){
                selected[3]=clickedItemName.getText();
                menuButton4.setText(itemName);
            }
            if(dropDownID.equals("menu5")){
                selected[4]=clickedItemName.getText();
                menuButton5.setText(itemName);
            }
            if(dropDownID.equals("menu6")){
                selected[5]=clickedItemName.getText();
                menuButton6.setText(itemName);
            }
        }
    }

    @FXML
    private Label myLabel;
    public void changeLabelText() {
        Item[] currentItem = new Item[6];
        for (int j = 0; j < currentItem.length ; j++) {
            for (int i = 0; i < itemList.size(); i++) {
                if(selected[j] != null){
                    if(selected[j].equals(itemList.get(i).getName())){
                            currentItem[j] = itemList.get(i);
                    }
                }
            }
        }
        String[] lines = new String[6];

        //display
        String lineFormat = "%-25s%-10s%-10s%-10s%-10s";
        for (int i = 0; i < lines.length; i++) {
            String bonusString = "";
            if(currentItem[i] == null){
                lines[i] = new String("- \n");
            }
            else {
                if(currentItem[i] instanceof AssassinItem localItem){
                    bonusString = String.format("%-15s", localItem.getLethality() + " lethality");
                }
                if(currentItem[i] instanceof MageItem){
                    MageItem localItem = (MageItem) currentItem[i];
                    bonusString = String.format("%-15s", localItem.getMana() + " mana");
                }
                if(currentItem[i] instanceof MarksmanItem){
                    MarksmanItem localItem = (MarksmanItem) currentItem[i];
                    bonusString = String.format("%-15s%-15s%-10s"
                            ,localItem.getAttackSpeed() + "% as"
                            ,localItem.getCriticalStrike() + "% crit"
                            ,localItem.getLifeSteal() + " lifesteal"
                    );
                }
                if(currentItem[i] instanceof SupportItem){
                    SupportItem localItem = (SupportItem) currentItem[i];
                    bonusString = String.format("%-15s%-15s"
                            ,localItem.getManaRegen()+ " mana reg."
                            ,localItem.getHealAndShield()+ " h&s"
                    );
                }
                if(currentItem[i] instanceof TankItem){
                    TankItem localItem = (TankItem) currentItem[i];
                    bonusString = String.format("%-15s%-15s"
                            ,localItem.getArmor() + " armor"
                            ,localItem.getMR() + "mr"
                    );
                }

                lines[i] = String.format(lineFormat,
                        currentItem[i].getName() + ":"
                        ,currentItem[i].getAD() + " ad"
                        ,currentItem[i].getAP() + " ap"
                        ,currentItem[i].getHP() + " hp"
                        ,currentItem[i].getAbilityHaste() + " ah"

                ) + bonusString + "\n";
            }
        }
        String sumLine = "------------------------------------------------------------------------------------------\nsum of all item stats: \n";

        int sumAd = 0;
        int sumAp = 0;
        int sumHp = 0;
        int sumAh = 0;
        int sumLeth = 0;
        int sumHaS = 0;
        int sumManaReg = 0;
        int sumMana = 0;
        int sumAs = 0;
        int sumCs = 0;
        int sumLs = 0;
        int sumArmor = 0;
        int sumMr = 0;

        for (int i = 0; i < currentItem.length; i++) {
            if(currentItem[i] != null){
                sumAd += currentItem[i].getAD();
                sumAp += currentItem[i].getAP();
                sumHp += currentItem[i].getHP();
                sumAh += currentItem[i].getAbilityHaste();
                if(currentItem[i] instanceof AssassinItem localItem){
                    sumLeth += localItem.getLethality();
                }
                if(currentItem[i] instanceof MageItem localItem){
                    sumMana += localItem.getMana();
                }
                if(currentItem[i] instanceof MarksmanItem localItem){
                    sumLs += localItem.getLifeSteal();
                    sumAs += localItem.getAttackSpeed();
                    sumCs += localItem.getCriticalStrike();
                }
                if(currentItem[i] instanceof SupportItem localItem){
                    sumHaS += localItem.getHealAndShield();
                    sumManaReg += localItem.getManaRegen();
                }
                if(currentItem[i] instanceof TankItem localItem){
                    sumArmor += localItem.getArmor();
                    sumMr += localItem.getMR();
                }
            }
        }

        String sumStringBase = String.format(
                "%-25s%-10s%-10s%-10s%-10s"
                ," "
                ,sumAd + " ad"
                ,sumAp + " ap"
                ,sumHp + " hp"
                ,sumAh + " ah"
        ) + "\n";
        String sumStringBonus1 = "...\n"+
                String.format("%-25s%-15s%-15s%-20s%-15s"
                ,sumLeth + " lethality"
                ,sumMana + " mana"
                ,sumLs + " life steal"
                ,sumAs + "% attack speed"
                ,sumCs + "% crit "
                ) + "\n";

        String sumStringBonus2 = String.format("%-25s%-15s%-15s%-15s"
                ,sumHaS + " Heal and Sheild"
                ,sumManaReg + " mana reg."
                ,sumArmor + " armor"
                ,sumMr + " magic resist"
        ) + "\n";

        myLabel.setText(lines[0] + lines[1] +lines[2] +lines[3] + lines[4] + lines[5]
                + sumLine + sumStringBase+ sumStringBonus1 + sumStringBonus2);
    }
}