/**
 * Created by opilane on 17.11.2016.
 */
public class Multadd {

    public static double multAdd(double a,double b,double c){
        double result=a*b+c;
        return result;
    }

    public static void main(String[] args){

            System.out.println(multAdd(1,2,3));

          double num1=1.0;
        double  num2=Math.sin((Math.PI)/4);
        double  num3=Math.cos(Math.PI/4)/2;

        System.out.print(multAdd(num1,num2,num3));

}}
