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
            //todo napisi vse id-je
            if(dropDownID.equals("menu1")){
                selected[0]=clickedItemName.getText();
                menuButton1.setText(itemName);
                System.out.println(itemName);
            }
            if(dropDownID.equals("menu2")){
                selected[1]=clickedItemName.getText();
                menuButton2.setText(itemName);
                System.out.println(itemName);
            }
            if(dropDownID.equals("menu3")){
                selected[2]=clickedItemName.getText();
                menuButton3.setText(itemName);
                System.out.println(itemName);
            }
            if(dropDownID.equals("menu4")){
                selected[3]=clickedItemName.getText();
                menuButton4.setText(itemName);
                System.out.println(itemName);
            }
            if(dropDownID.equals("menu5")){
                selected[4]=clickedItemName.getText();
                menuButton5.setText(itemName);
                System.out.println(itemName);
            }
            if(dropDownID.equals("menu6")){
                selected[5]=clickedItemName.getText();
                menuButton6.setText(itemName);
                System.out.println(itemName);
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
                else System.out.println("nekaj");
            }
        }
        if(currentItem[1] instanceof AssassinItem){}
        String[] lines = new String[6];
        String sum = "";

        //display
        String lineFormat = "%-25s%-10s%-10s%-10s";
        for (int i = 0; i < lines.length; i++) {
            String bonusString = "";
            if(currentItem[i] == null){
                lines[i] = new String("- \n");
                System.out.println("je null");
            }
            else {
                System.out.println("ni null");
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
                            ,localItem.getAttackSpeed() + " as"
                            ,localItem.getCriticalStrike() + " crit"
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
                        ,currentItem[i].getAP() + " ap"
                        ,currentItem[i].getAD() + " ad"
                        ,currentItem[i].getHealth() + " hp"

                ) + bonusString + "\n";
            }
        }
        String sumLine = "------------------\n+\n";
        String sumString = "test 1231";

        myLabel.setText(lines[0] + lines[1] +lines[2] +lines[3] + lines[4] + lines[5] + sumLine + sumString);

    }
}