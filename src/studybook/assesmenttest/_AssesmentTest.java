package studybook.assesmenttest;

/**
 * @author created: aabdelsalam on 2024-09-27 05:35
 * @author last change: $Author: $ on $Date: $
 * @version $Revision: $
 */
public class _AssesmentTest {

    private static int $;


    public static void main (String[]args)
    {
        String a_b;
       // logger.log($);
        System.out.println($);
   //     System.out.println(a_b);

    }
}

interface HasTail
{
    int getTailLength();
}

abstract  class Puma implements HasTail
{
    //protected
    public int getTailLength()
    {
        return 4;
    }
}


 class Cougar extends Puma
{
    public static void main (String[]args)
    {
       // Puma puma = new Puma();
       // System.out.println(puma.getTailLength());

        //4
        boolean keepGoing= true;
        int count = 0;
        int x =3;
        while (count++ < 3) // when count = 3 i do the iterate
        {
            int y = (1+2*count)%3;
            switch(y){
                default:
                case 0: x-=1;
                break;
                case 1: x+=5;
            }
        }
        System.out.println(x);

    }

}




