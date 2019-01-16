package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class  Connector {

    private static Connector instance = null;
    private Connection con = null;

    private Connector() {
    }

    Connection getConnection()
    {
        return this.con;
    }

    static Connector getInstance()
    {
        if (instance == null)
            instance = new Connector();
        return instance;
    }

    void openConnection()
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

    void closeConnection()
    {
        try {
            assert this.con != null;
            this.con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


