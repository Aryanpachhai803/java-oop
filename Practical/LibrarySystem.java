package Practical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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

    public static void addBook(String title, String author) {
        try (Connection con = getConnection()) {
            String query = "INSERT INTO books(title, author, available) VALUES (?, ?, true)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, title);
            ps.setString(2, author);

            ps.executeUpdate();
            System.out.println("✅ Book added!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        
    }
}
