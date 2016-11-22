/**
 * Created by eero on 22/11/2016.
 */
public class Exercise_6_6 {

    /**Exercise_Ch_6_6
     *1. Draw a stack diagram showing the state of the program just before the
     last invocation of prod completes.

     Answer: m=1  n=4
             m=1  n=3
             m=1  n=2 this is the state of the program before the last invocation
     of prod , as i understand it.

     2. What is the output of this program? (Try to answer this question on
     paper first, then run the code to check your answer.)

     Answer: 24

     3. Explain in a few words what prod does (without getting into the details
     of how it works).

     Answer:prod computes factorial n

     4. Rewrite prod without the temporary variables recurse and result.
     Hint: You only need one line for the else branch.

     Answer: return n*prod(m, n - 1);
     */

    public static void main(String[] args) {
        System.out.println(prod(1,4));
    }
    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
            int recurse = prod(m, n - 1);
            int result = n * recurse;
            return result;
        }
    }

}
