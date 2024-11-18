package com.example.final_project;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class drinks extends onlyS implements mthod{
    //private static drinks instance;
    int man;
    int lem;
    int sod;
   static Label ll;


static int  money;
    @FXML
    Label labelmenu2;

    @FXML
     TextField cocktail;

    @FXML
     TextField coffee;

    @FXML
     TextField lemon;

    @FXML
     TextField manga;

    @FXML
     TextField soda;

    @FXML
     TextField water;


    @FXML
    void cocktailint(KeyEvent event) {
        StringOnly(cocktail);

    }

    @FXML
    void coffeeint(KeyEvent event) {
        StringOnly(coffee);
    }

    @FXML
    void lemonint(KeyEvent event) {
        StringOnly(lemon);
    }

    @FXML
    void mangaint(KeyEvent event) {
        StringOnly(manga);
    }











    @FXML
    void showmenu3(ActionEvent event) throws Exception {
        try {
            lem = Integer.parseInt(lemon.getText());
        }
        catch (Exception e){}
        try {
            man = Integer.parseInt(manga.getText());
        }
        catch (Exception e){}
        try {
            sod = Integer.parseInt(soda.getText());
        }
        catch (Exception e){}

        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu3.fxml"));
        Parent root = loader.load();
        desserts dessert = loader.getController();
        dessert.checkin(lem,man,sod);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        money = (sod*30)+(lem*60)+(man*60);
        System.out.println(drinks.ll);


        /* FXMLLoader fxmlLoader = new FXMLLoader(desserts.class.getResource("menu3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/

    }

    @FXML
    void sodaint(KeyEvent event) {
        StringOnly(soda);
    }

    @FXML
    void waterint(KeyEvent event) {
        StringOnly(water);
    }

    /*public static drinks getInstance(){
        if(instance==null){
            instance=new drinks();
        }
        return instance;
    }*/
    @Override
    public void checkin(int b,int p, int c) {
       // labelmenu2.setText("rggbe");

        if (b>0)
            labelmenu2.setText( "Burger x" + b + "     " + b*120);

        if (p>0)

            labelmenu2.setText(labelmenu2.getText() + "\n" + "Pizza x" + p + "       " + p*200);

        if (c>0)
            labelmenu2.setText(labelmenu2.getText() + "\n"+ "Chicken x" + c+ "      " + c*180);
        ll = labelmenu2;
    }


    /*public int check(){
        int money;
        money = (Integer.parseInt(manga.getText())*60)+(Integer.parseInt(lemon.getText())*60)+(Integer.parseInt(cocktail.getText())*60)+(Integer.parseInt(soda.getText())*30)+(Integer.parseInt(coffee.getText())*50)+(Integer.parseInt(water.getText())*10);
        return money;
    }*/



}
