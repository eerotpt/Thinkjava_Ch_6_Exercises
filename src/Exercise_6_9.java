/**
 * Created by eero on 19/11/2016.
 */
public class Exercise_6_9 {

    public static double astendus(double arv, int astendaja) {
        if (astendaja == 0) {
            return 1;
        } else {
            return (arv*astendus(arv,astendaja-1));
        }
    }

    public static void main(String[] args){
        //edastame arvu ja astendaja meetodisse "astendus"
        double tulemus=astendus(3,4);
        //lõpptulemuse vaatamine
        System.out.println(tulemus);

    }
}
