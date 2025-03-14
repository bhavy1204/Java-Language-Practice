abstract class Animal {
    abstract void speak();
    void hear(){
        System.out.println("Animal is hearing");
    }
}

class Cat extends Animal{
    void speak(){
        System.out.println("Meow Meow !! ");
    }
}

public class AbstractPractice {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.speak();
        c.hear();
    }
}
