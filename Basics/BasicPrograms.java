import java.util.*;

public class BasicPrograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter num1 : ");
        // int a = input.nextInt();
        // System.out.print("Enter num2 : ");
        // int b = input.nextInt();
        // int add = a + b;
        // int sub = a - b;
        // int mul = a * b;
        // int div = a / b;
        // System.out.print("Add : " + add);
        // System.out.print("Multiply : " + mul);
        // System.out.print("Subtract : " + sub);
        // System.out.print("Division : " + div);

        // -------------------------Salary sheet--------------------------------
        System.out.print("Enter your salary : ");
        float salary = input.nextFloat();

        System.out.print("Enter % of daily allowence : ");
        float DAp = input.nextFloat();
        float DA = (salary * DAp) / 100;

        System.out.print("Enter % of house rent allowence : ");
        float HRAp = input.nextFloat();
        float HRA = (salary * HRAp) / 100;

        System.out.print("Enter % of other allowence : ");
        float ALp = input.nextFloat();
        float Al = (salary * ALp) / 100;

        System.out.print("Enter % of pf : ");
        float Pfp = input.nextFloat();
        float pf = (salary * Pfp) / 100;

        float grossSalary = DA + HRA + Al + salary;
        float netSalary = grossSalary - pf;

        System.out.println("---------SALARY SHEET---------------");
        System.out.println("Base salary : " + salary);
        System.out.println("Daily alllowence (" + DAp + ") : " + DA);
        System.out.println("Home rent allowence (" + HRAp + ") : " + HRA);
        System.out.println("Other allowence (" + ALp + ") : " + Al);
        System.out.println("PF (" + Pfp + ") : " + pf);
        System.out.println("Gross salary : " + grossSalary);
        System.out.println("Net salary : " + netSalary);
        System.out.println("------------------------------------");
    }
}