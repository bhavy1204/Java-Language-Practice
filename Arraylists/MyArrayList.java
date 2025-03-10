import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        int size = 1000000;
        System.gc();
        long start = System.currentTimeMillis();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Took " + (end - start) + "ms to execute ");

    }
}
