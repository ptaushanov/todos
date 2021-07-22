package com.tu.db;

import java.sql.*;


public class Driver {
    public static void main(String[] args) {
        try{
            // 1. Creating a database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/todos", "techkilla", "123456");

            // 2. Creating a SQL statement
            Statement exampleStatement = conn.createStatement();

            // 3. Executing the query
            ResultSet exampleResultSet = exampleStatement.executeQuery("SELECT * FROM users");

            // 4. Processing the result set
            while (exampleResultSet.next()){
                System.out.println(exampleResultSet.getString("username") + " " + exampleResultSet.getString("password"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
