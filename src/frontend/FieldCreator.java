package frontend;


import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FieldCreator {

    private Stage stage;
    private Controller controller;

    public FieldCreator(Stage stage, Controller controller) throws IOException {
        this.stage = stage;
        this.controller = controller;
    }

    public void createField(int h, int v){

        GridPane pane = new GridPane();

        for (int i = 0; i < v ; i++) {

            for (int j = 0; j < h ; j++) {

                Button button = new Button("X");
                button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

                pane.add(button,i,j);

            }

        }

        controller.setField1(pane);
        controller.setField2(pane);

    }


}
