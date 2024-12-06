package puzzle;

/**
 * @author created: aabdelsalam on 2024-05-24 09:23
 * @author last change: $Author: $ on $Date: $
 * @version $Revision: $
 */
public class Main {
    public static void main(String[] args)
    {
        var console = System.console();
        if(console!=null){
            console.format("%d %<x", 10);
        }
    }
}
