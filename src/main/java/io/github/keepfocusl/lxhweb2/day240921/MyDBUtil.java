package io.github.keepfocusl.lxhweb2.day240921;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDBUtil {
    private static Connection connection;

    public synchronized static Connection getConnection() {
        if (connection != null) {
            return connection;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/home", "root", "Lin13169730118.");
            System.out.println("Connected to database");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
