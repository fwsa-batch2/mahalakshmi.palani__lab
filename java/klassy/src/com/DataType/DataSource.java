package com.DataType;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
public class DataSource {

    public static void main(String[] args) {

        Connection conn = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = ""; // HOST Url
            String username = "";  // Database username
            String password = "";  // Database Password
            conn = DriverManager.getConnection(url, username, password);

            Statement statement = conn.createStatement();

            String query = "";   // Select query

            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                Integer id = rs.getInt("id");          // table column 1
                String name = rs.getString("name");    // table column 2

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
            }

            rs.close();
            statement.close();
            conn.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

}