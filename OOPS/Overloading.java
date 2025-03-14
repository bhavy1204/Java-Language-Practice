
class DemoThis {
    void show() {
        System.out.println("Simple Show ");
    }

    void show(int d) {
        System.out.println("With single data ");
    }

    void show(int d, String b) {
        System.out.println("WIth 2 data " + d + " , " + b);
    }

    void show(String s, int i) {
        System.out.println("Different sequence " + s + " , " + i);
    }
}

public class Overloading {
    public static void main(String args[]) {
        DemoThis p = new DemoThis();
        p.show();
        p.show(10);
        p.show("Hii", 40);
        p.show(20, "hehahahahaha");
    }
}
