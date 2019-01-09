package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    private static Connector instance = null;
    private Connection con = null;

    private Connector() {
    }

    public Connection getConnection()
    {
        return this.con;
    }

    public static Connector getInstance()
    {
        if (instance == null)
            instance = new Connector();
        return instance;
    }

    public void openConnection()
    {
        try {
            if(this.con == null || this.con.isClosed()) {
                this.con = DriverManager.getConnection("jdbc:mysql://localhost/schneeger", "root", "");
                System.out.println("Connect success!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection()
    {
        try {
            if(this.con != null || !this.con.isClosed()) {
                this.con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


