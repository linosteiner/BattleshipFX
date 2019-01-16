package main;

import frontend.Controller;
import frontend.FieldCreator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../frontend/controller.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        FieldCreator creator = new FieldCreator(primaryStage, controller);
        Master master = new Master(creator, controller);

        primaryStage.setTitle("BattleshipFX");
        Scene scene = new Scene(root, 800, 600);

        master.play();

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
