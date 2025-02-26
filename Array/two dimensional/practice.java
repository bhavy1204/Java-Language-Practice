import java.util.*;

public class practice {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        Scanner input = new Scanner(System.in);
        // regular/mnormal way of taking input for 2D arrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Enter marks of student " + i + " , for subject "+ j+" > ");
                arr[i][j]= input.nextInt();
            }
        }

        // Simple way of displaying 2D arrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }

        // Display array in string format with deepToString
        System.out.println("With deepToString method :- ");
        System.out.println(Arrays.deepToString(arr));

        // Another way of decallaring and showing 2D array with deepToString method
        int[][] matrix ={
            {1,2,3},
            {1,2,3},
            {1,2,3},
        };

        System.out.println(Arrays.deepToString(matrix));

        // Rotaing 2D array 

        int size = arr.length;
        System.out.println(size);
    }
}
