package com.jdbc.starter;

import com.jdbc.starter.util.ConnectionManager;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcRunner {

    public static void main(String[] args) throws SQLException {
        Class<Driver> driverClass = Driver.class;
        // вот текстовый блок, который не поддерживается
        String sql = """

""";
        try (var connection = ConnectionManager.open();
        var statement = connection.createStatement()) {
                System.out.println(connection.getTransactionIsolation());
                statement.execute("");
        }
        }
        }



