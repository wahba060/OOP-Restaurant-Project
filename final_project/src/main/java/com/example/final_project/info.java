package com.example.final_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class info extends onlyS{
    @FXML
    private Label pp_miss;
    @FXML
    private Label res_miss;
    @FXML
    private Label date_miss;
    @FXML
    private Label time_miss;
    @FXML
    private TextField reserverName;
    @FXML
     public DatePicker dateText;


    @FXML
    private TextField peopletext;

    @FXML
    private Button proceedbtn;

    @FXML
    private AnchorPane reserverText;


    @FXML
    private TextField timeText;

   static boolean e=false ;
     boolean b_time;
       boolean b_res;
       boolean b_people;
       boolean b_date;
    BufferedWriter writer;


    {
        try {
            writer = new BufferedWriter(new FileWriter("reserverInfo.txt",true));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void infocheck(){
        TextField[] textFields = new TextField[3];
        textFields[0]=timeText;
        textFields[1]=reserverName;
        textFields[2]=peopletext;
        Label[] labels = new Label[4];
        labels[0]=time_miss;
        labels[1]=res_miss;
        labels[2]=pp_miss;
        boolean[] booleans = new boolean[3];
        booleans[0]= b_time;
        booleans[1]=  b_res;
        booleans[2]=  b_people;
        for (int i = 0 ; i<3 ; i++) {
            if (textFields[i].getText().isEmpty()) {
                labels[i].setVisible(true);
                booleans[i] = false;
                System.out.println("missing");

            } else {
                booleans[i]= true;
                labels[i].setVisible(false);

            }
        }
        if(dateText.getValue() == null){
            date_miss.setVisible(true);
            b_date=false;
        }
        else{
            b_date =true;
            date_miss.setVisible(false);
        }
        e = booleans[0] && booleans[1] && booleans[2] && b_date;

    }
    @FXML
    void onlyint1(KeyEvent event) {
        StringOnly(peopletext);

    }

    @FXML
    void onlyint2(KeyEvent event) {
      StringOnly(timeText);
    }


    @FXML
    void proceedtomenu(ActionEvent event) throws IOException {


        infocheck();



if (e== true) {
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
    Scene scene = new Scene(fxmlLoader.load());
    Stage stage = new Stage();
    stage.setTitle("menu!");
    stage.setScene(scene);
    stage.show();
    writer.append("\n" + reserverName.getText());
    writer.append("\n" + peopletext.getText());
    writer.append("\n" + dateText.getValue());
    writer.append("\n" + timeText.getText());
    writer.close();

}


    }


}
