import java.util.*;

public class ArrayListMenu {
    Scanner input = new Scanner(System.in);
    List<Integer> arr = new ArrayList<>();

    void add() {
        // int d;
        // System.out.print("Enter data : ");
        // d = input.nextInt();
        // arr.add(d);
        for(int i=0;i<10;i++)
            arr.add(i+1);
    }

    void DeleteLast() {
        arr.remove(arr.size() - 1);
    }

    void DeleteFront() {
        arr.remove(0);
    }

    void DeleteSpecific() {
        int data, idx;
        System.out.println("enter data to be deleted : ");
        data = input.nextInt();
        idx = arr.indexOf(data);
        arr.remove(idx);
    }

    void show() {

        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
        // Iterator<Integer> it = arr.iterator();
        // while (it.hasNext()) {
        // int data = it.next();
        // System.out.println(data);
        // }
    }

    void Search() {
        System.out.println("Enter data to be searched : ");
        int data = input.nextInt();
        int found = 0;
        for (Integer i : arr) {
            if (i == data) {
                System.out.println("Element found at index : " + arr.indexOf(i));
                found = 1;
                break;
            }
        }
        if (found == 0)
            System.out.println("Data not found ");
    }

    void update(){
        System.out.println("Enter data to be updated : ");
        int data = input.nextInt();
        int found = 0;
        for (Integer i : arr) {
            if (i == data) {
                arr.set(arr.indexOf(i), input.nextInt());
                break;
            }
        }
        if (found == 0)
            System.out.println("Data not found ");
    }

    void menu() {
        int choice;
        do {
            System.out.println("1. Add");
            System.out.println("2. Delete from last");
            System.out.println("3. Delete from front");
            System.out.println("4. Delete sepcific data");
            System.out.println("5. View");
            System.out.println("6. Search");
            System.out.println("7. update");
            System.out.println("8. EXIT");
            System.out.print(">>> ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    DeleteLast();
                    break;
                case 3:
                    DeleteFront();
                    break;
                case 4:
                    DeleteSpecific();
                    break;
                case 5:
                    show();
                    break;
                case 6:
                    Search();
                    break;
                case 7:
                    update();
                    break;
                case 8:
                    System.out.println("EXITING");
                    break;
                default:
                    break;
            }
        } while (choice != 8);
    }

    public static void main(String[] args) {
        // int top=-1;
        ArrayListMenu main = new ArrayListMenu();
        main.menu();
    }
}
