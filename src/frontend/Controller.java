package frontend;

import backend.GameEngine;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class Controller {

    private GameEngine engine;

    @FXML
    private Pane field1;

    @FXML
    private Pane field2;

    @FXML
    private Pane legend1;

    @FXML
    private Pane legend2;


    public void setEngine(GameEngine engine) {
        this.engine = engine;
    }

    public Pane getField1() {
        return field1;
    }

    void setField1(Pane newField) {
        field1.getChildren().clear();
        field1.getChildren().add(newField);
    }

    public Pane getField2() {
        return field2;
    }

    void setField2(Pane newField) {
        field2.getChildren().clear();
        field2.getChildren().add(newField);
    }

    public Pane getLegend1() {
        return legend1;
    }

    public void setLegend1(Pane legend1) {
        this.legend1 = legend1;
    }

    public Pane getLegend2() {
        return legend2;
    }

    public void setLegend2(Pane legend2) {
        this.legend2 = legend2;
    }

    @FXML
    private void close(){
        Platform.exit();
    }

    @FXML
    private void newGame(){
        engine.newGame();
    }

}
