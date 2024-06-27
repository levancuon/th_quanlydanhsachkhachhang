package org.example.database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    private final static String jdbcURL = "jdbc:mysql://localhost:3306/customer?useSSL=false";
    private final static String jdbcName = "root";
    private final static String jdbcPassword = "rambolun190";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcName, jdbcPassword);
            System.out.println("--------successful--------");

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("-----------------Lỗi kết nối-----------------");
            e.printStackTrace();
        }
        return connection;
    }
}
