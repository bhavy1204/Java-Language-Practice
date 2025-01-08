
import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args){
        int[] arr={19,50,7,20,30};
        System.out.println("When printing array name : "+ arr);
        System.out.println("Printing array indecies : "+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
        int[] arr2=new int[5];
        System.out.println("Printing array indecies of un-initilaized array : "+arr2[0]+" "+arr2[1]+" "+arr2[2]+" "+arr2[3]+" "+arr2[4]);
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
    }
}
