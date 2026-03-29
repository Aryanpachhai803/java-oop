package Practical;

import java.sql.*;

public class InsertInDB {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "shiva1234";
        String query = "insert into student values (4, 'kumar', 'butwal')";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();

            int m = st.executeUpdate(query);

            if (m == 1)
                System.out.println("Inserted successfully");
            else
                System.out.println("Insertion failed");

            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}