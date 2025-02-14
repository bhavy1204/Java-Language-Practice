import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {
    private static final String username = "root";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/Student";
    private static final String password = "9928875294";

    public static void main(String[] args) {
        try {
            // Load drivers
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Creating connections
            // url,username,oassword should be in sequence offcourse...
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmnt= con.createStatement();
            String query = "select * from student";
            ResultSet res = stmnt.executeQuery(query);
            System.out.println("| Id |  Name  | Age | Marks |");
            System.out.println("-----------------------------------");
            while (res.next()) {
                int id = res.getInt("id");
                String name = res.getString("name");
                int age = res.getInt("age");
                int marks = res.getInt("marks");
                System.out.println(" | "+id+ " | "+ name +" | "+ age + " | "+ marks + " |" );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}