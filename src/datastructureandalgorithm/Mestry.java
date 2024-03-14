package datastructureandalgorithm;

/**
 * @author created: aabdelsalam on 2024-03-07 15:05
 * @author last change: $Author: $ on $Date: $
 * @version $Revision: $
 */
public class Mestry {
    private static int mestryFunction(int a, int b){
        System.out.println((a & b));
        System.out.println((a|b));
        System.out.println((a^b));
        return (a & b) + (a|b) - (a^b);
    }

    public static void main(String[] args) {
        int x=5;
        int y=7;
        int result = mestryFunction(x,y);
        System.out.println(result);
    }


}
