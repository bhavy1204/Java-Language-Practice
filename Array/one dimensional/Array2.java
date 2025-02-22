import java.util.Scanner;

public class Array2 {
    class matrix {
        Scanner sc = new Scanner(System.in);
        int row, col;
        int[][] arr;

        void input() {
            System.out.print("ENter number of rows : ");
            this.row = sc.nextInt();
            System.out.print("ENter number of cols : ");
            this.col = sc.nextInt();
            arr = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print("Enter (" + (i + 1) + "," + (j + 1) + ") index  : ");
                    arr[i][j] = sc.nextInt();
                }
            }

        };

        void display() {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++)
                    System.out.print(this.arr[i][j] + " ");
                System.out.println();
            }
        }

        void add(matrix m) {
            if (this.row == m.row && this.col == m.col) {
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++)
                        System.out.print((this.arr[i][j] + m.arr[i][j]) + " ");
                    System.out.println();
                }
            }else{
                System.out.println("Size not same can not peform addition");
            }
        }

        matrix multiply(matrix m){
            if (this.col == m.row) {
                matrix result = new matrix();

                result.row=m.row;
                result.col=this.col;
                result.arr = new int[m.row][this.col];

                for (int i = 0; i < result.row; i++) {
                    for (int j = 0; j < result.col; j++){
                        result.arr[i][j]=0;
                        for(int k =0 ;k<this.col;k++){
                            result.arr[i][j] += this.arr[i][k] * m.arr[k][j] ;
                        }
                    }
                }
                return result;
            }else{
                return null;
            }
        }
    };

    public static void main(String args[]) {
        Array2 obj = new Array2();
        matrix m = obj.new matrix();
        matrix m2 = obj.new matrix();

        m.input();
        m2.input();
        System.out.println("Matrix 1:- ");
        m.display();
        System.out.println("Matrix 2:- ");
        m2.display();
        System.out.println("Addiition of matrix 1 and 2 ");
        m.add(m2);

        matrix temp =  m.multiply(m2);
        if (temp != null) {
            System.out.println("Matrix multippication :- ");
            temp.display();
        }else{
            System.out.println("Multipication not possible cols not equal to rows");
        }
    }

}
