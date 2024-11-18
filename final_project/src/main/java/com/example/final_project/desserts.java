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
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

//import static com.example.final_project.drinks.dd;

public class desserts extends onlyS implements mthod{

int mol;
int kon;
int om;
    static int money;

    @FXML
    Label labelmenu3;
    @FXML
      TextField aly;

    @FXML
      TextField basboosa;

    @FXML
      TextField cheese;

    @FXML
      TextField iceCream;

    @FXML
      TextField konafa;

    @FXML
      TextField molten;

    @FXML
    void basboosaint(KeyEvent event) {
       StringOnly(basboosa);
    }

    @FXML
    void cheeseint(KeyEvent event) {
        StringOnly(cheese);
    }

    @FXML
    void creamint(KeyEvent event) {
        StringOnly(iceCream);
    }

    @FXML
    void konafaint(KeyEvent event) {
        StringOnly(konafa);
    }

    @FXML
    void moltenint(KeyEvent event) {
       StringOnly(molten);
    }

    @FXML
    void omalyint(KeyEvent event) {
        StringOnly(aly);
    }

    @FXML
    void showfinal(ActionEvent event) throws Exception {
        try {
            mol = Integer.parseInt(molten.getText());
        }
        catch (Exception e){}
        try {
            om = Integer.parseInt(aly.getText());
        }
        catch (Exception e){}
        try {
            kon = Integer.parseInt(konafa.getText());
        }
        catch (Exception e){}

        FXMLLoader loader = new FXMLLoader(getClass().getResource("check.fxml"));
        Parent root = loader.load();
        check checks = loader.getController();
        checks.checkin(mol,om,kon);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       // money = (mol*60)+(om*40)+(kon*40);

       //System.out.println(moneyy );

        /*FXMLLoader fxmlLoader = new FXMLLoader(drinks.class.getResource("check.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        food a = new food();
        drinks d;*/

    }

    @Override
    public void checkin(int l,int m, int s) {


         labelmenu3.setText(drinks.ll.getText());

        if (l>0)
            labelmenu3.setText(labelmenu3.getText() + "\n Lemon x" + l + "     " + l*60 );
        if (m>0)

            labelmenu3.setText( labelmenu3.getText() + "\n Manga x" + m + "     " + m*60);
        if (s>0)

            labelmenu3.setText(labelmenu3.getText() + "\n Soda x" + s + "    "  + s*30);

        drinks.ll.setText(labelmenu3.getText());


    }




}
