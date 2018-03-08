package dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import testDB.DB;


public class LoginDaoImpl {

   
  public static Connection getConnection() throws ClassNotFoundException {
        Connection con = null;
        try {
//Yparxoun kai alloi tropoi na ftiakeis to connection s ektos tou Properties
            Properties properties = new Properties();
            properties.setProperty("user", "root");
            properties.setProperty("password", "root");
            properties.setProperty("autoReconnect", "true");

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cruds", properties);

            System.out.println("douleuei");

        } catch (Exception e) {
            System.out.println(e);

            System.out.println("den mpike stin DB");
        }
        return con;

    }

    public static boolean validate(String name, String pass) {
        boolean status = false;
        try {
       Connection con = LoginDaoImpl.getConnection();
 PreparedStatement ps = con.prepareStatement("select * from user where name=? and pass=?");
            ps.setString(1, name);
            
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();
            status = rs.next();
            System.out.println("the status mes sto lginDao.java einai : " + status);
           
        } catch (Exception e) {
            System.out.println(e);

            System.out.println("DB its not connected");
        }
        return status;

    }
}
