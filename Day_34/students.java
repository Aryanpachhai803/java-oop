package Day_34;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class students {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college"; // default MySQL port
        String username = "root";
        String password = "aryan2020";
        String query = "SELECT * FROM students"; // replace with your table name

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection conn = DriverManager.getConnection(url, username, password);

            // Create Statement
            Statement st = conn.createStatement();

            // Execute Query
            ResultSet rs = st.executeQuery(query);

            // Process Results
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }

            // Close resources
            rs.close();
            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace(); // better than just System.out.println(e)
        }
    }
}
