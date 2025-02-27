// import java.util.*;
import java.sql.*;

class PracticeMore{

    public static void main(String[] args){
        String url = "jdbc:mysql://127.0.0.1:3306/Student";
        String username = "root";
        String password = "9928875294";
        try{
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmnt = con.createStatement();
            String q = "SHOW TABLES;";
            ResultSet res = stmnt.executeQuery(q);
            while(res.next()){
                System.out.println(res.getString(1));
            }
        }catch(SQLException e){
            System.out.print(e.getMessage());
        }
    }
}