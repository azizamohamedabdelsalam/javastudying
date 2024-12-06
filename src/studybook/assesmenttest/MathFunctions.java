package studybook.assesmenttest;

/**
 * @author created: aabdelsalam on 2024-09-27 07:02
 * @author last change: $Author: $ on $Date: $
 * @version $Revision: $
 */
public class MathFunctions {
    public static void addToInt(int x, int amountToAdd)
        {
            x=x+amountToAdd;
        }
        public static void main (String[]args)
        {
            int a=15;
            int b = 10;
            MathFunctions.addToInt(a,b);
            System.out.println(a);
        }

}
