package airlinemanagementsystem;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem", "root", "Vansh@2604");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Conn();
    }
}