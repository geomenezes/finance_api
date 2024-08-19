package com.project.finance_api;

import java.sql.*;

public class ConnectionDB {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:sqlite:finance.db");

            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            statement.executeUpdate("drop table if exists user");
            statement.executeUpdate("create table user (id integer, nome string, email string");

            statement.executeUpdate("insert into user values(1, geo)");

            ResultSet rs = statement.executeQuery("select * from user");
            while (rs.next()) {
                System.out.println("name = " + rs.getString("name"));
                System.out.println("id = " + rs.getString("id"));
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if(connection != null)
                    connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
