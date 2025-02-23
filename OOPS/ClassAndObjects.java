// package OOPS;

public class ClassAndObjects {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.set(5);
        d.show();
    }
}

// 4 access specifiers:-
class Demo {
    int data;

    void set(int d) {
        data = d;
    }

    void show() {
        System.out.println(data);
    }
}