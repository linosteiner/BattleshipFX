package frontend;


import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FieldCreator {

    private Stage stage;
    private Controller controller;
    private Scene scene;



    public FieldCreator(Stage stage, Controller controller) throws IOException {
        this.stage = stage;
        this.controller = controller;
    }

    public void createField(int h, int v){

        GridPane pane1 = new GridPane();
        GridPane pane2 = new GridPane();

        for (int i = 0; i < v ; i++) {

            for (int j = 0; j < h ; j++) {

                Button button1 = new Button("X");
                button1.setPrefWidth(20.0);
                pane1.add(button1,i,j);

                Button button2 = new Button("X");
                button2.setPrefWidth(20.0);
                pane2.add(button2,i,j);
            }
        }

        controller.setField1(pane1);
        controller.setField2(pane2);

    }


}
