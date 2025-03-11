class A {
    final int a = 10;

    public void show() {
        System.out.println(a);
    }
}

class B extends A {
    public final void show() {
        System.out.println("B class function");
        // a++;
    }
}

public class Final {
    public static void main(String[] args) {
        A b = new B();
        b.show();
    }
}
