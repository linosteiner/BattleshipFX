package backend;

import frontend.Controller;
import frontend.FieldCreator;

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


    }

    private void selectPlayer2(){

    }

    private void chooseFieldSize(){

        //TODO: Popup to choose difficulty
        creator.setHeight(10);
        creator.setWidth(10);

    }

    private void createField1(){

    }

    private void createField2(){

    }



    public void putShips(){

    }

    public void switchPlayer(){

    }


    public void abortGame(){

    }

}
