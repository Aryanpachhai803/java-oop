package Practical;

import java.sql.*;

public class UpdateInDB {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "shiva1234";
        String query = "update student set student_name = 'diwas' where student_id = 1";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            Statement st = conn.createStatement();

            int m = st.executeUpdate(query);

            if (m == 1)
                System.out.println("Updated successfully");
            else
                System.out.println("Update failed");

            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}