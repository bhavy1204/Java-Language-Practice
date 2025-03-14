abstract class Animal {
    abstract void speak();
    void hear(){
        System.out.println("Animal is hearing");
    }
}

interface temp{
    int data=10;
    void showData();
}

class Cat extends Animal implements temp{
    void speak(){
        System.out.println("Meow Meow !! ");
    }
    public void showData(){
        System.out.println("This is data : "+temp.data);
    }
}

public class AbstractPractice {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.speak();
        c.hear();
    }
}
