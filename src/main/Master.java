package main;

import backend.GameEngine;
import backend.Ranking;
import frontend.Controller;
import frontend.FieldCreator;

public class Master {

    private GameEngine gameEngine;


    Master(FieldCreator creator, Controller controller) {

        gameEngine = new GameEngine(controller, creator);
        Ranking ranking = new Ranking();
    }


    void play(){

        gameEngine.newGame();
    }

    public void showRanking(){

    }
}
