package com.example.final_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javax.swing.*;


public  class check {
    @FXML
     Label amount;

    @FXML
      Label order;

    @FXML
    TextField promo;
    @FXML
    private Label valid;
    @FXML
    private Label promLa;
int Fprice = food.money + drinks.money + desserts.money;

    public void checkin(int b,int p, int c) {

        order.setText(order.getText() + "\n" + drinks.ll.getText());
        if (b>0)

            order.setText( order.getText() + "\n Molten x" + b + "     " + b*60);
        if (p>0)

          order.setText(order.getText() + "\n Om Aly x" + p + "     " + p*40);
        if (c>0)

          order.setText(order.getText() + "\n Konafa x" + c + "     " + c *40);
     desserts.money = (b*60)+(p*40)+(c*40);

     amount.setText("Total Price -> "+ (Fprice+desserts.money));
     valid.setVisible(false);


    }


    //public void recalc(ActionEvent actionEvent) {

    //}
    String w = "team_wahba";
    @FXML
    void recalc(MouseEvent event) {
        String input;
        input = promo.getText();
        if(w.equals(input)) {
            amount.setText("Total Price ->" + ((Fprice + desserts.money) - ((Fprice + desserts.money) * 0.90)));
            valid.setVisible(false);
            promLa.setVisible(true);
        }
        else {
            valid.setVisible(true);
            promLa.setVisible(false);

        }
        System.out.println(input);
    }
}
