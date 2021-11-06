package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class ConnectDB {

    public static void main(String[] args)  {
         String DBName = "library";
         String url = "jdbc:mysql://localhost:3306/" + DBName;
         String username = "root";
         String password = "root";

        try {
            System.out.println("Connection is successful to DB");
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connected to DB");

            Statement stat = con.createStatement();
            String sql = "select * from reader_tb";
            ResultSet rs = stat.executeQuery(sql);

            while ( rs.next()) {
                int id = rs.getInt("ID");
                String first_name = rs.getString("first_name");
                String second_name = rs.getString("second_name");
                String address = rs.getString("address");

                String p = id + " " + first_name + " " + second_name + " " + address;
                System.out.println(p);
            }

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }

    }
}
