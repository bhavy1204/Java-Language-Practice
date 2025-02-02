import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.print.attribute.standard.MediaSize.NA;

class library {
    private int a = 10;

    public void Greet() {
        System.out.println("Hello " + a);
    }
}

class books {
    private String Name;
    private float price;
    private int ISBN;
    private String author;
    private int quantity;

    void set(Scanner input) {
        System.out.println("Enter Name of Book : ");
        this.Name = input.nextLine();
        System.out.println("Enter Author of Book : ");
        this.author = input.nextLine();
        System.out.println("Enter price of Book : ");
        this.price = input.nextFloat();
        System.out.println("Enter ISBN of Book : ");
        this.ISBN = input.nextInt();
        System.out.println("Enter Quantity of Book : ");
        this.quantity = input.nextInt();
    }

    void show() {
        System.out.println("Name : " + this.Name);
        System.out.println("Author : " + this.author);
        System.out.println("Price : " + this.price);
        System.out.println("ISBN : " + this.ISBN);
        System.out.println("Quantity : " + this.quantity);
    }

    String getName() {
        return this.Name;
    }
}

class Admin {

    private ArrayList<books> books = new ArrayList<>();

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

    public void addBook(Scanner input) {
        books b = new books();
        b.set(input);
        books.add(b);
    }

    public void removeBook(Scanner input) {
        String n;
        System.out.print("ENter Name of the book : ");
        n = input.nextLine();

        Iterator<books> it = books.iterator();
        boolean found = false;

        while (it.hasNext()) {
            books b = it.next();
            if (b.getName().equalsIgnoreCase(n)) {
                b.show();
                it.remove();
                found = true;
                System.out.println("----BOOK DELETED SUCCESSFULLY----");
                break;
            }
        }
        if (found == false) {
            System.out.println("----BOOK \" " + n + " \" Not Found----");
        }
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

            // To check for numeric inputs only
            while (!input.hasNextInt()) {
                System.out.println("Please enter a valid number ");
                input.next();
                System.out.print(">>>");
            }

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
