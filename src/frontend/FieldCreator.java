package frontend;

import backend.Player;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FieldCreator {

    private Controller controller;
    private Scene scene;
    private int height;
    private int width;



    public FieldCreator(Stage stage, Controller controller) {
        this.controller = controller;
    }

    public void createGUIFields(Player player){

        GridPane pane1 = new GridPane();
        GridPane pane2 = new GridPane();

        for (int i = 0; i < width ; i++) {

            for (int j = 0; j < height ; j++) {

                createButton(pane1, i, j);

                createButton(pane2, i, j);
            }
        }

        controller.setField1(pane1);
        controller.setField2(pane2);

    }

    private void createButton(GridPane pane1, int i, int j) {
        Button button1 = new Button("O");
        button1.setPrefWidth(30.0);
        button1.setPrefHeight(30.0);
        button1.setMinSize(Button.USE_PREF_SIZE, Button.USE_PREF_SIZE);
        button1.setOnAction(e ->{
            ((Button)e.getSource()).setText("X");
        });
        pane1.add(button1,i,j);
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
