package com.klu.JdbcProject;
import java.sql.*;
public class App {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db?useSSL=false",
                "root",
                "welcome"
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("sno") + " " +
                    rs.getString("sname") + " " +
                    rs.getInt("smarks")
                );
            }

            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
