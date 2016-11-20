/**
 * Created by eero on 20/11/2016.
 */
public class Exercise_6_7_OddSum {

    // Sum of odd numbers from 1 to "num"
    public static int oddSum(int num){

        if (num%2==0 || num<0)
            throw new IllegalArgumentException("Not a positive odd number");
        if (num==1) {
            return 1;
        }else {
            int result=num+oddSum(num-2);
            return result;
        }
    }

    public static void main(String[] args){
        int result=oddSum(99);
        System.out.println(result);
    }
}
