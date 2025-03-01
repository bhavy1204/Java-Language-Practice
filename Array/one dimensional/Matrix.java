import java.util.Scanner;

public class Matrix {
    Scanner input = new Scanner(System.in);
    int arr[][];
    int row, col;

    void input() {
        System.out.print("Enter number of rows : ");
        row = input.nextInt();
        System.out.print("Enter number of cols : ");
        col = input.nextInt();
        arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                System.out.print("Enter value of ["+i+","+j+"] : ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("-------------data enterd successfully----------");
    }

    void display() {
        System.out.println("-------------MATRIX-------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(this.arr[i][j] + " ");
            System.out.println("");
        }
        System.out.println("--------------------------------");
    }

    Matrix add(Matrix m1) {
        if(this.arr == null)
            this.input();
        Matrix m2 = new Matrix();
        if (m1.row == this.row && m1.col == this.col) {
            m2.arr = new int[m1.row][m1.col];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++)
                    m2.arr[i][j] = this.arr[i][j] + m1.arr[i][j];
            }
        } else
            System.out.println("Size not same");
        return m2;
    }

    Matrix sub(Matrix m1) {
        if(this.arr == null)
            this.input();
        Matrix m2 = new Matrix();
        if (m1.row == this.row && m1.col == this.col) {
            m2.arr = new int[m1.row][m1.col];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++)
                    m2.arr[i][j] = this.arr[i][j] - m1.arr[i][j];
            }
        } else
            System.out.println("Size not same");
        return m2;
    }

    Matrix mul(Matrix m1){
        if(this.arr == null)
            this.input();
        Matrix m2 = new Matrix();
        if ( this.col ==m1.row) {
            m2.arr = new int[this.row][m1.col];
            for (int i = 0; i < this.arr.length; i++) {
                for (int j = 0; j < m1.arr[0].length; j++) {
                    for (int k = 0; k < this.arr[i].length; k++)
                        m2.arr[i][j] += this.arr[i][k] * m1.arr[k][j];
                }
            }
        } else
            System.out.println("Size not same");
        return m2;
    }

    void menu() {
        int choice;
        Matrix m = new Matrix();
        do {
            Matrix m1 = new Matrix();
            Matrix res = new Matrix();
            System.out.println("ENTER YOUR CHOICE");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Addition");
            System.out.println("4. Subtaraction");
            System.out.println("5. Multipication");
            System.out.println("6. EXIT ");
            System.out.print(">>> ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    m.input();
                    break;
                case 2:
                    m.display();
                    break;
                case 3:
                    m1.input();
                    res = m.add(m1);
                    if(res.arr!= null)
                        res.display();
                    break;
                case 4:
                    m1.input();
                    res = m.sub(m1);
                    if(res.arr != null)
                        res.display();
                    break;
                case 5:
                    m1.input();
                    res = m.mul(m1);
                    if(res.arr != null)
                        res.display();
                    break;
                case 6:
                    System.out.println("EXITING");
                    break;
                default:
                    break;
            }
        } while (choice != 6);
    }

    public static void main(String args[]) {
        Matrix m = new Matrix();
        m.menu();
    }
}
