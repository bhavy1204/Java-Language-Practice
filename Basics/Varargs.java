public class Varargs {
    static int add(int... nums) {
        int sum=0;
        for(int i : nums)
            sum += i;
        return sum;
    }
    static double avg(double... nums){
        double sum=0;
        for(double i :nums)
            sum+= i;
        return sum/nums.length;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2,4,3,3,4));
        System.out.println(avg(1,2,4,3,3,4));
    }
}
