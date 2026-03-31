package Practical;

import java.sql.Connection;
import java.sql.DriverManager;

public class LibrarySystem {
    static final String URL = "jdbc:mysql://localhost:3306/library_db";
    static final String USER = "root";
    static final String PASSWORD = "your_password";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("Database connection failed!");
            return null;
        }
    }
    public static void main(String[] args) {
        
    }
}
