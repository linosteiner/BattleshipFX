package frontend;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FieldCreator {

    private Stage stage;
    private Controller controller;
    private Scene scene;
    private int height;
    private int width;



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
