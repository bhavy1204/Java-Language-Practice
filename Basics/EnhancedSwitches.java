import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String day = input.next();
        switch (day) {
            case "sunday", "Sunday", "Saturday", "saturday " -> System.out.println("Weekend BC ! ");
            case "monday", "tuesday", "wednesday", "thrusday", "friday" -> System.out.println("KAAM KARO BC ! ");
            default -> System.out.println("Tere baap ne banaya kya gaandu ");
        }
        input.close();
    }
}