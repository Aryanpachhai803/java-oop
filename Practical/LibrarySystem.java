package Practical;

import java.sql.*;
import java.util.Scanner;

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
            System.out.println("Book added!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void viewBooks() {
        try (Connection con = getConnection()) {
            String query = "SELECT * FROM books";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            System.out.println("\nID | Title | Author | Status");
            System.out.println("----------------------------------");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("title") + " | " +
                        rs.getString("author") + " | " +
                        (rs.getBoolean("available") ? "Available" : "Issued")
                );
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void issueBook(int id) {
        try (Connection con = getConnection()) {
            String query = "UPDATE books SET available = false WHERE id = ? AND available = true";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Book issued!");
            } else {
                System.out.println("Book not available!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void returnBook(int id) {
        try (Connection con = getConnection()) {
            String query = "UPDATE books SET available = true WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Book returned!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    addBook(title, author);
                    break;

                case 2:
                    viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int issueId = sc.nextInt();
                    issueBook(issueId);
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    int returnId = sc.nextInt();
                    returnBook(returnId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
