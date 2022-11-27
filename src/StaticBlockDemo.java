public class StaticBlockDemo {

    static int j = 8;
    static int  n;

    /*
    * Static Block in Java
    * It is used to initialize the static data member.
*  It is executed before the main method at the time of class loading.
* If you need to do the computation in order to initialize your static variables,
*  you can declare a static block that gets executed exactly once, when the class is first loaded.
*  We can’t access non-static variables in the static block.  A class can have multiple Static blocks,
* which will execute in the same sequence in which they have been written into the program.
    * */
    static{
        System.out.println("static block initialization");
        n=j*8;
    }
    static{
        System.out.println("static block initialization2");
        j=7;
        n=j*2;
    }
    public static void main (String args[]){
        System.out.println("inside main method");
        System.out.println(j);
        System.out.println(n);
    }
}
