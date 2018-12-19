package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SpielerDAO {
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

    public void connect() {
        Connector.getInstance().openConnection();
        con = Connector.getInstance().getConnection();
    }

    public void close() {
        Connector.getInstance().closeConnection();
    }


}
