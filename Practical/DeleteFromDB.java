package Practical;

import java.sql.*;

public class DeleteFromDB {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "shiva1234";
        String query = "delete from student where student_id = 1";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();

            int m = st.executeUpdate(query);

            if (m == 1)
                System.out.println("Deleted successfully");
            else
                System.out.println("Delete failed");

            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}