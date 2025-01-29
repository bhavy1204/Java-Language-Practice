// import java.util.Scanner;

// public class Conditions {
//     public static void main(String args[]){
//         System.out.print("Enter a number : ");
//         Scanner sc= new Scanner(System.in);
//         int num = sc.nextInt();
//         if (num>0) 
//             System.out.println("Number is positive " + num);
//         else if (num<0)
//             System.out.println("Number is negative "+ num);
//         else
//             System.out.println("You enterd zero "+ num);
//     }
// }

//--------------------------------------------------------------------------------

// import java.util.Scanner;

// public class Conditions{
//     public static void main(String args[]){
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.print("ENter your temperature : ");
//             double temp = sc.nextDouble();
//             if(temp>100)
//                 System.out.println("You have fever ");
//             else if(temp >70)
//                 System.out.print("You are normal");
//             else if(temp>0)
//                 System.out.println("You have fever");
//             else
//                 System.out.println("INVALID TEMPERATURE");
//         }
//     }
// }

// ---------------------------------------------------------------------------

// import java.util.Scanner;

// public class Conditions{
//     public static void main(String args[]){
//         try(Scanner sc = new Scanner(System.in)){
//             System.out.print("Enter day of the week ");
//             int day = sc.nextInt();
//             switch(day){
//                 case 1:
//                 System.out.println("Sunday");
//                 break;
//                 case 2:
//                 System.out.println("Monday");
//                 break;
//                 case 3:
//                 System.out.println("Tuesday");
//                 break;
//                 case 4:
//                 System.out.println("Wednesdday");
//                 break;
//                 case 5:
//                 System.out.println("Thrusday");
//                 break;
//                 case 6:
//                 System.out.println("Friday");
//                 break;
//                 case 7:
//                 System.out.println("Saturday");
//                 break;
//                 default:
//                 System.out.println("INVALID INPUT ");
//                 break;
//             }
//         };
//     }
// }

// -----------------------------------------------------------------------

// public class Conditions{
//     public static void main(String args[]){
//         int a =50, b=30;
//         boolean y = (a<b)? true: false;
//         int z = (a>b)?a:b;
//         System.out.println(y);
//         System.out.println(z);
//     }
// }

//-----------------------------------------------------------------------------


// import java.util.Scanner;
// public class Conditions {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENter a year : ");
//         int year = sc.nextInt();
//         if (year < 0)
//             System.out.println("Invalid year");
//         else {
//             boolean x = year % 4 == 0;
//             boolean y = year % 100 != 0;
//             boolean z = ((year % 100 == 0) && (year % 400 == 0));
//             if (x && (y || z))
//                 System.out.println("yes " + year + " is a leap year");
//             else
//                 System.out.println("No " + year + " is not a leap year ");
//         }
//     }
// }


// ------------------------------------------------------------------------------

