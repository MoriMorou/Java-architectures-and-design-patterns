package ru.morou.DataMapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    private static Connection connection;

    private DBManager() {}

    public static void init() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
        }
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            init();
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (!connection.isClosed() && connection != null) {
            connection.close();
        }
    }
}
