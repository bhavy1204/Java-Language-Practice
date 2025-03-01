import java.util.Scanner;

public class Practice1 {
    int row, col;
    int arr[][];

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
    // static void getInput(Scanner input, int arr[][]) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // System.out.print("Enter [" + i + "," + j + "] index : ");
    // arr[i][j] = input.nextInt();
    // }
    // }
    // }

    void arrInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        row = input.nextInt();
        System.out.print("Enter number of cols : ");
        col = input.nextInt();
        arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter value of [" + i + "," + j + "] : ");
                arr[i][j] = input.nextInt();
            }
        }
        input.close();
    }

    void display() {
        System.out.println("--------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println("");
        }
        System.out.println("--------------------------------------");
    }

    void addition() {
        Practice1 p1 = new Practice1();
        Practice1 p2 = new Practice1();
        Practice1 p3 = new Practice1();
        p1.arrInput();
        p2.arrInput();
        if (p1.row == p2.row && p1.col == p2.col) {
            p3.row = p1.row;
            p3.col = p1.col;
            // To initialize the object with 0 values
            p3.arr = new int[p1.row][p1.col];

            for (int i = 0; i < p1.arr.length; i++) {
                for (int j = 0; j < p1.arr[i].length; j++) {
                    p3.arr[i][j] = p1.arr[i][j] + p2.arr[i][j];
                }
            }
            p3.display();
        } else
            System.out.println("Bhai matrix padh ke aa pehle har kuch kar raha hai ! ");
    }

    void subtraction() {
        Practice1 p1 = new Practice1();
        Practice1 p2 = new Practice1();
        Practice1 p3 = new Practice1();
        p1.arrInput();
        p2.arrInput();
        if (p1.row == p2.row && p1.col == p2.col) {
            p3.row = p1.row;
            p3.col = p1.col;
            // To initialize the object with 0 values
            p3.arr = new int[p1.row][p1.col];

            for (int i = 0; i < p1.arr.length; i++) {
                for (int j = 0; j < p1.arr[i].length; j++) {
                    p3.arr[i][j] = p1.arr[i][j] - p2.arr[i][j];
                }
            }
            p3.display();
        } else
            System.out.println("Bhai matrix padh ke aa pehle har kuch kar raha hai ! ");
    }

    void multipication() {
        Practice1 p1 = new Practice1();
        Practice1 p2 = new Practice1();
        Practice1 p3 = new Practice1();
        p1.arrInput();
        p2.arrInput();
        if (p1.col == p2.row) {
            p3.row = p1.row;
            p3.col = p2.col;
            // To initialize the object with 0 values
            p3.arr = new int[p1.row][p2.col];

            for (int i = 0; i < p1.arr.length; i++) {
                for (int j = 0; j < p2.arr[0].length; j++) {
                    for (int k = 0; k < p1.arr[i].length; k++) {
                        p3.arr[i][j] += p1.arr[i][k] * p2.arr[k][j];
                    }
                }
            }
            p3.display();
        } else
            System.out.println("Bhai matrix padh ke aa pehle har kuch kar raha hai ! ");
    }

    // main menu
    void menu() {
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("-----------Matrix calculator-----------");
            System.out.println("1. create");
            System.out.println("2. display");
            System.out.println("3. addition");
            System.out.println("4. subtraction");
            System.out.println("5. multipication");
            System.out.println("6. EXIT");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    arrInput();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    addition();
                    break;
                case 4:
                    subtraction();
                    break;
                case 5:
                    multipication();
                    break;
                case 6:
                    System.out.println("Bye Bye ! ");
                    break;
                default:
                    System.out.println("Incorrect Input ");
                    break;
            }
        } while (choice != 6);
        input.close();
    }

    public static void main(String[] args) {
        Practice1 p = new Practice1();
        p.menu();
    }
}