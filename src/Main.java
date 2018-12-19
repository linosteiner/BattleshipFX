import frontend.Controller;
import frontend.FieldCreator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    private FieldCreator creator;
    private Controller controller;

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("frontend/controller.fxml"));
        Parent root = loader.load();
        controller = loader.getController();
        creator = new FieldCreator(primaryStage, controller);

        creator.createField(10,10);

        //Parent root = FXMLLoader.load(getClass().getResource("frontend/controller.fxml"));
        primaryStage.setTitle("BattleshipFX");
        primaryStage.setScene(new Scene(root, 600, 400));



        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
