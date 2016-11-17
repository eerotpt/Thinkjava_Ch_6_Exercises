/**
 * Created by opilane on 17.11.2016.
 */
public class Training {

    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println("n="+n);
            int s=n*n;
            System.out.println(s);

        }
    }

    public static void main(String[] args){
        int x=2;
        countup(3);
        System.out.println("Have a nice day.");
    }
}




