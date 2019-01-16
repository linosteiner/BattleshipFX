import backend.GameEngine;
import backend.Ranking;
import frontend.Controller;
import frontend.FieldCreator;

public class Master {

    private FieldCreator creator;
    private Controller controller;

    private GameEngine gameEngine;
    private Ranking ranking;


    public Master(FieldCreator creator, Controller controller) {
        this.creator = creator;
        this.controller = controller;

        gameEngine = new GameEngine(controller, creator);
        ranking = new Ranking();
    }


    public void play(){

        gameEngine.newGame();
    }

    public void showRanking(){

    }
}
