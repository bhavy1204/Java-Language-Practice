package Bits;

public class Basics {
    public void base(){
        int a = 5;
        int b=7;
        System.out.printf(" | >>> %d ",(a | b));
        System.out.printf(" | >>> %d ",(a & b));
        System.out.printf(" | >>> %d ",(a >> b));
        System.out.printf(" | >>> %d ",(a << b));
        System.out.printf(" | >>> %d ",(a ^ b));
        System.out.printf(" | >>> %d ",(~a));
        System.out.printf(" | >>> %d ",(~b));
    }
    public static void main(String[] args) {
        Basics b = new Basics();
        b.base();
    }
}
