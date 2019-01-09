package backend;

import frontend.Controller;
import frontend.FieldCreator;
import javafx.scene.Scene;

public class GameEngine {

    private Controller controller;
    private FieldCreator creator;

    private Player currentPlayer;
    private Player player1;
    private Player player2;
    private Field field1;
    private Field field2;


    public GameEngine(Controller controller, FieldCreator creator) {
        this.controller = controller;
        this.creator = creator;
    }

    public void newGame(){

        selectPlayer1();
        selectPlayer2();

        chooseFieldSize();


        createField1();
        createField2();

    }

    private void selectPlayer1(){

        //TODO: Choose or create Player 1
        player1 = new Player("Hans");
    }

    private void selectPlayer2(){

        //TODO: Choose or create Player 2
        player2 = new Player("Fritz");

    }

    private void chooseFieldSize(){

        //TODO: Popup to choose difficulty
        creator.setHeight(10);
        creator.setWidth(10);


    }

    private void createField1(){

        //TODO: Create Field in Backend
        field1 = new Field(creator.getWidth(), creator.getHeight());



        //GUI
        creator.createGUIFields(player1);

    }

    private void createField2(){

        //TODO: Create Field in Backend


        //GUI
        creator.createGUIFields(player2);

    }



    public void putShips(){

    }

    public void switchPlayer(){

    }


    public void abortGame(){

    }

}
