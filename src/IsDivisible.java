/**
 * Created by opilane on 17.11.2016.
 */
public class IsDivisible {

    public static boolean isDivisible(int n, int m){
        if (n%m==0){
            return true;
        }else{
            return false;
        }
    }
public static void main(String[] args){
   if (isDivisible(6,3)){
       System.out.print("True");
   }else{
       System.out.print("False");
   }

}

}
