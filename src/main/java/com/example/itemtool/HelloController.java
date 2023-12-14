package com.example.itemtool;

import com.example.itemtool.Item_naloga.Item;
import com.example.itemtool.Item_naloga.izpeljanjeAssassin.AxiomArc;
import com.example.itemtool.Item_naloga.izpeljanjeAssassin.DuskbladeofDraktharr;
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

//    String selected1;
//    String selected2;
//    String selected3;
//    String selected4;
//    String selected5;
//    String selected6;
    @FXML
    private Label welcomeText;

    public HelloController(){
        selected = new String[6];
        itemList = new ArrayList<Item>();
        itemList.add(new AxiomArc());
        itemList.add(new DuskbladeofDraktharr());
        //todo daj vse
    }

    @FXML
    private void menuClick(ActionEvent event) {
        // Handle the menu item click event here
        System.out.println("Menu item clicked!");
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
    public void changeLabelText() { //TODO
        Item[] currentItem = new Item[6];
        for (int j = 0; j < currentItem.length ; j++) {
            for (int i = 0; i < itemList.size(); i++) {
                if(selected[j].equals(itemList.get(i).getName())){
                    currentItem[j] = itemList.get(i);
                }
            }
        }
        String[] lines = new String[6];
        String sum = "";

        //display
        String lineFormat = "%-40s%-10s%-10s%-10s";
        for (int i = 0; i < lines.length; i++) {

            lines[i] = String.format(lineFormat,
                    currentItem[i].getName() + ":"
                    ,currentItem[i].getAP() + " ap"
                    ,currentItem[i].getAD() + " ad"
                    ,currentItem[i].getHealth() + " hp").replace(' ','\u00A0') + "\n";
        }

        myLabel.setText(lines[0] + lines[1] +lines[2] +lines[3] + lines[4] + lines[5]);

    }


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}