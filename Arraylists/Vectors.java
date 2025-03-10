
import java.util.List;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        int size = 1000000;
        System.gc();
        long start = System.currentTimeMillis();
        List<Integer> vec = new Vector<Integer>();
        for (int i =0 ;i<size;i++) {
            vec.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Took "+(end-start)+"ms to execute ");
    }
}
