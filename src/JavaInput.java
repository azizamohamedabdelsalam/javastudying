

import java.util.Scanner;

public class JavaInput {
    public static void main(String args[]){
      /*  Scanner sc = new Scanner(System.in);

        int a ;
        System.out.println("Enter an Integer: ");
        a= sc.nextInt() ;
        System.out.println("You Entered an Integer =" + a);*/

        /*for(int i=0; i< args.length;i++){
            System.out.println("args[" + i + "]: " + args[i]);
        }*/
        for (String arg:args){
            int argumentInt = Integer.parseInt(arg);
            System.out.println("each Integer is "+ argumentInt);
        }

    }

}
