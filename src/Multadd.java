/**
 * Created by opilane on 17.11.2016.
 */
public class Multadd {

    public static double multAdd(double a,double b,double c){
        double result=a*b+c;
                return result;
    }

    public static void main(String[] args){
           //invoking multAdd with 1.0 2.0 3.0
            System.out.println("Answer 6.4.3 ="+multAdd(1,2,3));
         //calculating sin((Math.PI)/4 + cos(Math.PI/4)/2
          double num1=1.0;
        double  num2=Math.sin((Math.PI)/4);
        double  num3=Math.cos(Math.PI/4)/2;
        System.out.printf("Answer 6.4.4(1) =%.4f \n",multAdd(num1,num2,num3));

        //calculating log 10 + log 20
        double num11=1.0;
        double  num22=(Math.log(10))/(Math.log(10));//dividing to get log from ln
        double  num33=(Math.log(20))/(Math.log(10));//dividing to get log from ln
        double numout=multAdd(num11,num22,num33);
        System.out.printf("Answer 6.4.4(2) =%.3f", numout);
    }
   // public static double expSum(double parameter){

       // return result2;
    //}
}
