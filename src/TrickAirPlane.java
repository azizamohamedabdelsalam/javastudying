/**
 * @author created: aabdelsalam on 2023-12-07 12:35
 * @author last change: $Author: $ on $Date: $
 * @version $Revision: $
 */
public class TrickAirPlane {
    static int start =2 ;
    final int end ;
    public TrickAirPlane(int x) {
        x=4 ;
        end = x ;
    }
    public void fly(int distance) {
        System.out.print(end-start+" ");
        System.out.print(distance);
    }

    public static void main(String... start) {
        new TrickAirPlane(10).fly(5);
    }
}
