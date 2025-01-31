import java.util.*;

class library {
    private int a = 10;

    public void Greet() {
        System.out.println("Hello " + a);
    }
}

class Admin {
    private String userName = "Admin";
    private String password = null;

    public boolean authenticate(Scanner input) {
        System.out.print("Enter Your password : ");
        String pass = input.nextLine();

        String hashedEnteredPassword = Password.hashPassword(pass);

        // Get the stored hashed password from the file
        String storedPassword = Password.getStoredPassword();

        if (storedPassword != null && storedPassword.equals(hashedEnteredPassword))
            return true;
        else
            return false;
    };

    public void addBook() {

    }

    public void removeBook() {

    }

    public void viewBook() {

    }

    public void dueBooks() {

    }
}

public class LMS {
    
    public static void main(String args[]) {
        library l = new library();
        l.Greet();
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin();
        // if ( admin.authenticate(input)) {
        //     System.out.println("Access granted");
        // }else 
        // System.out.println("Access not granted");

        System.out.print("Do you want to set a new admin password? (yes/no): ");
        String choice = input.nextLine().toLowerCase();

        if (choice.equals("yes")) {
            System.out.print("Enter new password: ");
            String newPassword = input.nextLine();
            String hashedPassword = Password.hashPassword(newPassword);
            Password.savePassword(hashedPassword);
            System.out.println("✅ Password set successfully!");
        } else {
            if(admin.authenticate(input)){
                System.out.print("all ok ");
            }else{
                System.out.print("all not ok ");
            }
        }

        input.close();
    }

}
