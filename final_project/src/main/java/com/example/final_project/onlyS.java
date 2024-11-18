package com.example.final_project;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

public class onlyS {
    public void StringOnly(TextField e){
        e.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {

                    e.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }
}
