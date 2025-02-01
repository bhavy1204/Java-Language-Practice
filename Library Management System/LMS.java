import java.util.*;

class library {
    private int a = 10;

    public void Greet() {
        System.out.println("Hello " + a);
    }
}

class Admin {

    public boolean authenticate(Scanner input) {

        System.out.print("Enter Your username : ");
        String userName = input.nextLine();

        System.out.print("Enter Your password : ");
        String pass = input.nextLine();

        String hashedEnteredPassword = Password.hashPassword(pass);
        String hashedEntereduserName = Password.hashUsername(userName);

        // Get the stored hashed password from the file
        String storedPassword = Password.getStoredPassword();

        // Get stpred username for admin
        String storedUserName = Password.getStoredPassword();

        if (storedPassword != null && storedUserName.equals(hashedEntereduserName)
                && storedPassword.equals(hashedEnteredPassword))
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
        // System.out.println("Access granted");
        // }else
        // System.out.println("Access not granted");
        int Mchoice = 0;
        do {
            System.out.println("----------------WELCOME TO LIBRARY------------------------");
            System.out.println("Select any choice :- ");
            System.out.println("1. Admin ");
            System.out.println("2. User ");
            System.out.print(">>> ");

            
            Mchoice = input.nextInt();
            input.nextLine();
            switch (Mchoice) {
                case 1:
                    System.out.print("Do you want to set a new admin password? (yes/no): ");
                    String choice = input.nextLine().toLowerCase();

                    if (choice.equals("yes")) {
                        System.out.print("Enter new password: ");
                        String newPassword = input.nextLine();

                        String hashedPassword = Password.hashPassword(newPassword);
                        Password.savePassword(hashedPassword);

                        System.out.println(" Password set successfully!");


                        System.out.print("Enter new UserName : ");
                        String newUserName = input.nextLine();

                        String hashedUserName = Password.hashUsername(newUserName);
                        Password.saveUserName(hashedUserName);

                        System.out.println("UserName set successfully!");
                    } else {
                        if (admin.authenticate(input))
                            System.out.print("all ok ");
                        else
                            System.out.print("all not ok ");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.print("EXITING");
                    break;
                default:
                    System.out.println("Invalid choice.. Please Select from given options ");
                    break;
            }
        } while (Mchoice != 4);

        input.close();
    }

}
