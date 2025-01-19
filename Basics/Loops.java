// public class Loops {
//     public static void main(String args[]){
//         for (int i=0; i<5;i++) {
//             System.out.println("Hello");
//             i+=2;
//         }
//     }
// }

// ---------------------------------------------------------------------

// import java.util.Scanner;
// public class Loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int EvenSum=0,OddSum=0;
//         for(int i=0;i<5;i++){
//             System.out.print("Enter a number : ");
//             int n = sc.nextInt();
//             if (n%2==0)
//                 EvenSum+=n;
//             else
//                 OddSum+=n;
//         }
//         System.out.println("Even Sum  : "+ EvenSum);
//         System.out.println("Odd Sum  : "+ OddSum);
//     }
// }

// --------------------------------------------------------------------------

// import java.util.Scanner;
// public class Loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n,i=1;
//         System.out.println("Enter a number : ");
//         n = sc.nextInt();
//         while (i!=11) {
//             System.out.println(n +" X "+i+" = "+ (n*i));
//             i++;
//         }
//     }
// }

// ---------------------------------------------------------------------------

// import java.util.Scanner;

// public class Loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your number : ");
//         int n = sc.nextInt();
//         int i = n;
//         int fact = 1;
//         while (n != 1) {
//             fact *= n;
//             n--;
//         }
//         System.out.println("Factorial of " + i + " is " + fact);
//     }
// }
