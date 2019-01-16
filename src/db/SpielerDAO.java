package db;

import backend.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SpielerDAO implements iKing {
    private Connection con = null;
    private ResultSet rs;
    private PreparedStatement ps;
    private Statement stmt = null;

    public SpielerDAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public int registerNewPlayer() {
        return 0;
    }

    @Override
    public int updateStats() {
        return 0;
    }

    @Override
    public Player loadPlayerStats() {
        return null;
    }

    @Override
    public Player loadPlayer() {
        return null;
    }

    @Override
    public int unRegisterPlayer() {
        return 0;
    }

    @Override
    public int getPlayerID() {
        return 0;
    }

    public void connect() {
        Connector.getInstance().openConnection();
        con = Connector.getInstance().getConnection();
    }

    public void close() {
        Connector.getInstance().closeConnection();
    }
}
