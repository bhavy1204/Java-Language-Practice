class Demo {
    int data;

    Demo() {
        System.out.println("Defult constructor is called ");
    }

    Demo(int data) {
        System.out.println("Parameterized constructor is called ");
        this.data = data;
    }

    // Shallow copy for primitive data types
    // Demo(Demo d){
    // System.out.println("Shallow copy constructor is called ");
    // this.data = d.data;
    // }
    Demo(Demo d) {
        this.data = d.data;
    }
}

class Constructors {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(10);
        Demo d3 = new Demo(d2);
        System.out.println("---------------------------------------");
        System.out.println(d1.data);
        System.out.println(d2.data);
        System.out.println(d3.data);
        // d2 = new Demo();
    }
}


