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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;



public class food extends onlyS  {

 int bur;
 int chick ;
 int piza;
     static int money ;


    @FXML
       TextField burger;

    @FXML
     TextField chicken;

    @FXML
     TextField fries;

    @FXML
     TextField mac;

    @FXML
     AnchorPane pane;

    @FXML
     TextField pizzaa;

    @FXML
     TextField steak;




    @FXML
    void onlyint1(KeyEvent event) {

        StringOnly(pizzaa);


    }

    @FXML
    void onlyint2(KeyEvent event) {
        StringOnly(burger);


    }

    @FXML
    void onlyint3(KeyEvent event) {
        StringOnly(steak);


    }

    @FXML
    void onlyint4(KeyEvent event) {
        StringOnly(chicken);

    }

    @FXML
    void onlyint5(KeyEvent event) {
        StringOnly(fries);

    }

    @FXML
    void onlyint6(KeyEvent event) {
        StringOnly(mac);

    }

        @FXML
    void menu2(ActionEvent event) throws Exception {
            try {
                bur = Integer.parseInt(burger.getText());
            }
           catch (Exception e){}
            try {
                piza = Integer.parseInt(pizzaa.getText());

            }
            catch (Exception e){}
            try {
                chick = Integer.parseInt(chicken.getText());
            }
            catch (Exception e){}


                FXMLLoader loader = new FXMLLoader(getClass().getResource("menu2.fxml"));
                Parent root = loader.load();
                drinks drinks = loader.getController();
                drinks.checkin(bur,piza,chick);
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                money = (bur*120)+ (piza*200)+(chick*180);
            System.out.println("null "  + piza);








        }







}
