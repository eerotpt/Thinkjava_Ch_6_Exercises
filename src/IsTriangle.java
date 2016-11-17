/**
 * Created by opilane on 17.11.2016.
 */
public class IsTriangle {

    public static boolean isTriangle(int side1, int side2, int side3) {

        if (side1 > side2 && side1 > side3) {
            if ((side2 + side3) > side1) {
                return true;
            } else {
                return false;
            }
        }

        if (side2 > side1 && side2 > side3) {
            if ((side1 + side3) > side2) {
                return true;
            } else {
                return false;
            }
        }

        if (side3 > side1 && side3 > side2) {
            if ((side1 + side2) > side3) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    } public static void main(String[] args){
        if (isTriangle(6,3,4)){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
}}