// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;

// public class CRUD {
//     private static final String username = "root";
//     private static final String url = "jdbc:mysql://127.0.0.1:3306/Student";
//     private static final String password = "9928875294";

//     public static void main(String[] args) {
//         try {
//             // Load drivers
//             Class.forName("com.mysql.cj.jdbc.Driver");

//         } catch (ClassNotFoundException e) {
//             System.out.println(e.getMessage());
//         }

//         try {
//             // Creating connections
//             // url,username,oassword should be in sequence offcourse...
//             Connection con = DriverManager.getConnection(url, username, password);
//             Statement stmnt= con.createStatement();
//             String query = "select * from student";
//             ResultSet res = stmnt.executeQuery(query);
//             System.out.println("| Id |  Name  | Age | Marks |");
//             System.out.println("-----------------------------------");
//             while (res.next()) {
//                 int id = res.getInt("id");
//                 String name = res.getString("name");
//                 int age = res.getInt("age");
//                 int marks = res.getInt("marks");
//                 System.out.println(" | "+id+ " | "+ name +" | "+ age + " | "+ marks + " |" );
//             }
//         } catch (SQLException e) {
//             System.out.println(e.getMessage());
//         }

//     }
// }

import java.sql.*;
import java.util.Scanner;

public class CRUD {
    public static final String username = "root";
    public static final String url = "jdbc:mysql://127.0.0.1:3306/Student";
    public static final String password = "9928875294";

    // TO insert data
    public static void insert(){
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmnt = con.createStatement();
            String name = "Temp";
            int age = 19;
            double marks = 78;
            String query = "INSERT INTO student(name,age,marks) values('"+name+"',"+age+","+marks+")";
            int res = stmnt.executeUpdate(query);
            if (res>0) {
                System.out.println("Inserted successfully");
            }else{
                System.out.println("Error occured");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    // To read data
    public static void read() {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmnt = con.createStatement();
            String query = "select * from student";
            ResultSet res = stmnt.executeQuery(query);
            // To read data
            while (res.next()) {
                int id = res.getInt("id");
                String name = res.getString("name");
                int age = res.getInt("age");
                double marks = res.getDouble("marks");
                System.out.println("ID : " + id);
                System.out.println("Name : " + name);
                System.out.println("age : " + age);
                System.out.println("marks : " + marks);
                System.out.println("-----------------------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Insert");
            System.out.println("2. read");
            System.out.println("3. update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print(">>> ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    insert();
                    break;
                case 2:
                    read();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Please enter a valid choice ");
                    break;
            }
        } while (choice != 5);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}