package com.leena.OCP.JDBC10;

import java.sql.*;


public class TestConnection {

    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        System.out.println(conn);
    }
}