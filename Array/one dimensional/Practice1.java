import java.util.*;

public class Practice1 {
    int row,col,choice = 0;
    int arr[][]= new int[row][col];
    // static void getInput(Scanner input, int arr[][]) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // System.out.print("Enter [" + i + "," + j + "] index : ");
    // arr[i][j] = input.nextInt();
    // }
    // }
    // }

    // Wrong format in term sof java because it is not following OOPS which is
    // foundation for java
    // static void display(int arr[][]) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // System.out.println(arr[i][j] + " ");
    // }
    // System.out.println("");
    // }
    // }

    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        row = input.nextInt();
        System.out.println("Enter number of cols : ");
        col = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter value of [" + i + "," + j + "] : ");
                arr[i][j] = input.nextInt();
            }
        }
    }

    void display() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Practice1 p = new Practice1();
        do {
            System.out.println("-----------Matrix calculator-----------");
            System.out.println("1. create");
            System.out.println("2. display");
            System.out.println("3. addition");
            System.out.println("4. subtraction");
            System.out.println("5. multipication");
            System.out.println("6. EXIT");
        } while (p.choice !=6);
        switch (p.choice) {

            case 1:
                p.input();
                break;
            case 2:
                p.display();
                break;
            default:
                break;
        }
    }
}