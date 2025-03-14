interface Engine{
    void start();
}

interface Color{
    String color="Black";
    void show();
}


class Wheels{
    int radius=20;
    void showSize(){
        System.out.println("Wheel Size : "+radius);
    }
}
class Car extends Wheels implements Engine,Color{
    public void start() {
        System.out.println("Engine starting");
    }
    public void show(){
        System.out.println("Car color : "+Color.color);
    }
}

public class Multiple {
    public static void main(String[] args) {
        Car c = new Car();
        c.show();
        c.start();
        c.showSize();
    }
}
