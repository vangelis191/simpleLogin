package testDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {

    private static Connection con = null;

    public static Connection getConnection() throws Exception {

        if (con != null) {
            
            return con;
        } else {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cruds", "root", "root");
           System.out.println("CONNECED");

            return con;
        }

    }
}
