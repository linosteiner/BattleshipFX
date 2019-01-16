package frontend;

import backend.GameEngine;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.util.Pair;

import java.util.Optional;

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

    @FXML
    private void diffEasy(){
        engine.chooseDifficulty(8,8);
    }

    @FXML
    private void diffMedium(){
        engine.chooseDifficulty(12,12);
    }

    @FXML
    private void diffHard(){
        engine.chooseDifficulty(15,15);
    }

    @FXML
    private void diffCustom(){

        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Custom difficulty");

        // Set the button types.
        ButtonType loginButtonType = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20, 150, 10, 10));


        TextField from = createTextField();
        TextField to = createTextField();

        gridPane.add(from, 0, 0);
        gridPane.add(new Label("x"), 1, 0);
        gridPane.add(to, 2, 0);

        dialog.getDialogPane().setContent(gridPane);

        // Request focus on the username field by default.
        Platform.runLater(from::requestFocus);

        // Convert the result to a username-password-pair when the login button is clicked.
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return new Pair<>(from.getText(), to.getText());
            }
            return null;
        });

        Optional<Pair<String, String>> result = dialog.showAndWait();


        //Convert Pair (String to int)
        if(result.isPresent()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error ");
            alert.setHeaderText("Number format error");
            alert.setContentText("Only numbers between 1 and 15 allowed");

            try {
                int h = Integer.parseInt(result.get().getKey());
                int w = Integer.parseInt(result.get().getValue());

                if(h > 0 && h < 16 && w > 0 && w < 16){
                    engine.chooseDifficulty(h,w);
                }else {
                    alert.showAndWait();
                }
            }catch (NumberFormatException n){

                alert.showAndWait();
            }
        }
    }

    private TextField createTextField() {
        TextField textField = new TextField();
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                textField.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        return textField;
    }
}
