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

import java.util.Scanner;

public class Conditions{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("ENter your temperature : ");
        double temp = sc.nextDouble();
        if(temp>100)
            System.out.println("You have fever ");
        else if(temp >70)
            System.out.print("You are normal");
        else if(temp>0)
            System.out.println("You have fever");
        else
            System.out.println("INVALID TEMPERATURE");
    }
}