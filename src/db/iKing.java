package db;

import backend.Player;

import java.util.ArrayList;

public interface iKing {

    int registerNewPlayer();
    int updateStats();
    Player loadPlayerStats();
    Player loadPlayer();
    int unRegisterPlayer();
    int getPlayerID();

}
