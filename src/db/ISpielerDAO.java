package db;

import backend.Player;

import java.util.ArrayList;

public interface ISpielerDAO {

    int registerNewPlayer();
    int updateStats();
    Player loadPlayerStats();
    Player loadPlayer();
    int unRegisterPlayer();
    int getPlayerID();

}
