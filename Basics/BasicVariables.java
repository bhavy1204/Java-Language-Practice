// public class BasicVariables {
//     public static void main(String[] args) {
//         int a = 10;
//         System.out.println(a);
//     }
// }
// public class BasicVariables {
//     String name;
//     int age;

//     BasicVariables() {
//         this.name = "Ashish";
//         this.age = 19;
//     }

//     public static void main(String[] args) {
//         BasicVariables a = new BasicVariables();
//         System.out.println("Hello " + a.name + " I am a instance progarm ");
//         System.out.println("I got to know that you are : " + a.age + " years old");
//     }
// }
//-------------------------------------------------------------------
//  Different Data types :-
//  1. Primitive 
//  2. Non Primitive
// In primivitve data type we have :- byte,short,int,long,floatt,double,char,boolean
//In non primitive we have :- String,arrays etc.
public class BasicVariables {
    public static void main(String[] args) {
        int a = 1023456789;
        float b = 12.37689963F;
        Double c = 12.3463457893826272D;
        long d = 1234567567890765456L;
        byte e = 122;
        char f = 's';
        boolean g = true;
        System.out.println("Int : " + a);
        System.out.println("Float : " + b);
        System.out.println("Double : " + c);
        System.out.println("Long : " + d);
        System.out.println("Byte" + e);
        System.out.println("Char : " + f);
        System.out.println("Boolean : " + g);
        System.out.println("-----NON PRIMITIVE DATA TYPE-----");
        String s="Bhavy";
        int n=  s.length();
        char c2=s.charAt(3);
        System.out.println("Length of string : "+ n);
        System.out.println("Char at 3 index : "+ c2);
    }
}