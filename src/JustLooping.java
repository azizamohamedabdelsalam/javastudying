/**
 * @author created: aabdelsalam on 2024-02-05 11:47
 * @author last change: $Author: $ on $Date: $
 * @version $Revision: $
 */

public class JustLooping {

    private int j;

    void showJ(){

        while(j<=5){

            for(int j=1; j <= 5;){

                System.out.print(j+" ");

                j++;

            }

            j++;

        }

    }

    public static void main(String[] args) {

        new JustLooping().showJ();

    }

}