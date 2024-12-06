package studybook.assesmenttest;

import java.util.Stack;

/**
 * @author created: aabdelsalam on 2024-10-13 19:54
 * @author last change: $Author: $ on $Date: $
 * @version $Revision: $
 */
public class EnthuwareTest1 {
    public static void main (String args[])
    {
       String str ="123";
       long x = Long.valueOf(str).longValue();
       long y = Long.parseLong(str);

       int i,j,k;
       i=j=k=9;
       System.out.println(x + "" + i + j + k);
       String str1 ="b";
       String str2="B";
       System.out.println(str1.equals(str2));
//        long y = 123_456_L;
//        long z = _123_456L;
//
//        float f1 = 123_.345_667F;
        float f2 = 123_345_667F;
        Stack s1 = new Stack();
        Stack s2 = new Stack ();
        processStacks (s1,s2);
        System.out.println (s1 + "    "+ s2);

        EnthuwareTest1 ot = new EnthuwareTest1();
        String[] arr = new String[2];
        ot.initData(arr);
        ot.printData(arr);
    }
    public static void processStacks(Stack x1, Stack x2){
//assume that the method push adds the passed object to the stack.
        x1.push (new Integer ("100"));
        x2 = x1;
    }
    public void initData(String[] arr){
        int ind = 0;
        for(String str : arr){
            str.concat(str+" "+ind);
            ind++;
        }
    }

    public void printData(String[] arr){
        for(String str : arr){
            System.out.println(str);
        }
    }
}
