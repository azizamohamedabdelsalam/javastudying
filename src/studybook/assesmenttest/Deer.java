package studybook.assesmenttest;

/**
 * @author created: aabdelsalam on 2024-09-27 07:08
 * @author last change: $Author: $ on $Date: $
 * @version $Revision: $
 */
public class Deer {
    public Deer() {
        System.out.print("Deer");
    }

    public Deer(int age) {
        System.out.print("DeerAge");
    }

    private boolean hasHorn() {
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorn());
    }
}

class Reindeer extends Deer {
    public Reindeer(int age) {
        System.out.print("Reindeer");
    }

    public boolean hasHorn() {
        return true;
    }

}
