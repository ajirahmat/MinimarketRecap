package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    public static Connection connection = null;

    public Koneksi() {
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/Ruko";
        String user = "root";
        String password = "";
        
        try {
            Class.forName(driverName);
            System.out.println("Driver is successful to load");
            try {
                connection = DriverManager.getConnection(url,user, password);
                System.out.println("Database is successful toload");

            } catch (SQLException ex) {

                System.out.println("Database is failed to load");
                System.out.println("SQLException: "+ ex.getMessage());

            }

        } catch (Exception e) {

            System.out.println("Driver is failed to load");
            System.out.println("Exception: " + e.getMessage());

        }

    }

}
