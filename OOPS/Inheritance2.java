public class Inheritance2 {
    public static void main(String[] args) {
        // This creates a memory space for object of derived3 in heap memory 
        Derived1 d1 = new Derived3();
        d1.show();
        d1.temp();
        // Explicit downcasting to access the features of derived 3
        Derived3 d3 = (Derived3) d1;
        System.out.println(d3.derived3data);
        // Derived2 d2 = new Derived2();
        // d2.show();
    }
}

class base {
    int data = 5;
    // private int privData = 10;
    protected int protData = 20;
    public int pubData = 30;

    base() {
        System.out.println("----------------------------------");
        System.out.println("Base class constructor ");
    }
}

class Derived1 extends base {
    int classData = 10;

    Derived1() {
        System.out.println("Derived1 class constructor");
    }

    public void show() {
        System.out.println("Deafult : " + data);
        System.out.println("Public : " + pubData);
        System.out.println("Protected : " + protData);
        System.out.println("Class data : " + classData);
        // System.out.println("Private : "+ privdata);
    }

    public void temp(){
        System.out.println("Inside derived 1");
    }

}

class Derived2 extends base {
    Derived2() {
        System.out.println("Derived2 constructor called ");
    }

    public void show() {
        System.out.println("Deafult : " + data);
        System.out.println("Public : " + pubData);
        System.out.println("Protected : " + protData);
        // System.out.println("Private : "+ privdata);
    }

}

class Derived3 extends Derived1 {
    public int derived3data=200;
    Derived3(){
        System.out.println("Derived3 constructor called");
    }

    public void show() {
        System.out.println("Derived1 : " + classData);
        System.out.println("Public : " + pubData);
        System.out.println("Protected : " + protData);
        // System.out.println("Class data : " + classData);
    }

    public void temp2(){
        System.out.println("Inside derived 3");
    }
}


// Here what basically happend is that first heaap memory is reserved for the object of derived3 and a refrence variable d1 was created which points to the derived3 object but it can only access the features of d1 because off its type (Derived1) so if we wish to access the features of derived3 we need to do explicit downcasting that is :- derived3 d3 = (Derived3) d1; now this d3 object is created which can access the features of d3 ! 
// D1 is stored in the stack memory which holds the address
// d1 → Is a reference variable (stored in stack memory) that stores the memory address of the Derived3 object in the heap.