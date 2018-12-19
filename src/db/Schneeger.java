package db;

import backend.Player;

public interface Schneeger {

    int registerNewPlayer();
    int updateStats();
    Player loadPlayerStats();
    Player loadPlayer();
    int unRegisterPlayer();
    int getPlayerID();

}
