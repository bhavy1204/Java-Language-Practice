// package OOPS;

import java.util.*;

public class ClassAndObjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Demo d = new Demo();
        d.set(5);
        d.show();
        System.out.println("ENter num of persons : ");
        int size = input.nextInt();
        input.nextLine();
        Person p[] = new Person[size];
        for (int i = 0; i < p.length; i++) {
            System.out.println("Name :- ");
            String tempName = input.nextLine();
            System.out.println("Occupation :- ");
            String tempOcc= input.nextLine();
            System.out.println("Age :- ");
            int tempAge= input.nextInt();
            input.nextLine();
            p[i]= new Person(tempName,tempOcc,tempAge);
        }
        for(int i = 0 ;i<p.length;i++){
            p[i].show();
        }
        input.close();
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

class Person {
    String name;
    int age;
    String occupation;

    Person(String name, String occ, int age) {
        this.name = name;
        this.occupation = occ;
        this.age = age;
    }

    void show() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Occupation : " + this.occupation);
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}