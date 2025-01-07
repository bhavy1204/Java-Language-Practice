// public class BasicVariables {
//     public static void main(String[] args) {
//         int a = 10;
//         System.out.println(a);
//     }
// }
public class BasicVariables {
    String name;
    int age;

    BasicVariables() {
        this.name = "Ashish";
        this.age = 19;
    }

    public static void main(String[] args) {
        BasicVariables a = new BasicVariables();
        System.out.println("Hello " + a.name + " I am a instance progarm ");
        System.out.println("I got to know that you are : " + a.age + " years old");
    }
}