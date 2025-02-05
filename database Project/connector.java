import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class connector {
    public static void insertData(Scanner input, Connection conn) {
        try {
            input.nextLine();
            System.out.println("ENter name : ");
            String n = input.nextLine();
            System.out.println("ENter id : ");
            int id = input.nextInt();
            input.nextLine();

            // write query
            String query = "INSERT INTO test (id,name) VALUES (?,?)";
            PreparedStatement pt = conn.prepareStatement(query);
            pt.setInt(1, id);
            pt.setString(2, n);

            // Inserting
            int rowsInserted = pt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println(" Data inserted successfully!");
            }
            // closing
            pt.close();

        } catch (SQLException e) {
            System.out.println(" Error inserting data!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Database details
        Scanner input = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/javaD";
        String user = "root";
        String password = "9928875294";
        // ---------------------------------------
        try {
            // // Load JDBC driver (not needed in modern JDBC, but good practice)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");

            // Sample SQL execution
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS test (id INT PRIMARY KEY, name VARCHAR(50))");
            System.out.println("Table created successfully!");

            // Close connection
            // conn.close();

            int choice = 0;
            do {
                System.out.println("Choose");
                System.out.println("1. Insert data ");
                System.out.println("2. Exit");
                choice = input.nextInt();
                input.nextLine();
                switch (choice) {
                    case 1:
                        insertData(input, conn);
                        break;

                    default:
                        break;
                }
            } while (choice != 2);

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection error!");
            e.printStackTrace();
        }
    }
}
