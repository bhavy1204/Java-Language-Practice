import java.util.*;

public class Library {
    public static void main(String args[]) {
        LMS l = new LMS();
        l.Greet();
        Scanner input = new Scanner(System.in);
        input.close();
    }

}

class LMS {
    private int a = 10;

    public void Greet() {
        System.out.println("Hello " + a);
    }
}
