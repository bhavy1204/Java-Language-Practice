import java.util.Scanner;

public class Matrix2 {
    int row, arr[][], size[];

    void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        row = input.nextInt();

        arr = new int[row][];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter size of row "+(i+1)+" : ");
            int x = input.nextInt();
            arr[i] = new int[x];
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = j + 1;
        }

        // for (int i = 0; i < arr.length; i++) {
        // for (j = 0; j < arr[i].length; j++)
        // arr[i][j] = j + 1;
        // }

        display();
        input.close();
    }

    void display() {

        System.out.println("---------------------------------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Matrix2 m = new Matrix2();
        m.input();
    }
}
