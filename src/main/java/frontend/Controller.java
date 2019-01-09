package frontend;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

public class Controller {

    @FXML
    private GridPane field1;

    @FXML
    private GridPane field2;

    @FXML
    private GridPane legend1;

    @FXML
    private GridPane legend2;


    public GridPane getField1() {
        return field1;
    }

    public void setField1(GridPane field1) {
        this.field1 = field1;
    }

    public GridPane getField2() {
        return field2;
    }

    public void setField2(GridPane field2) {
        this.field2 = field2;
    }

    public GridPane getLegend1() {
        return legend1;
    }

    public void setLegend1(GridPane legend1) {
        this.legend1 = legend1;
    }

    public GridPane getLegend2() {
        return legend2;
    }

    public void setLegend2(GridPane legend2) {
        this.legend2 = legend2;
    }
}
