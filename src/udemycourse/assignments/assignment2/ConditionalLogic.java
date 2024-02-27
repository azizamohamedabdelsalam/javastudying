package udemycourse.assignments.assignment2;

import java.util.Scanner;

/**
 * @author created: aabdelsalam on 2024-02-19 11:39
 * @author last change: $Author: $ on $Date: $
 * @version $Revision: $
 */
public class ConditionalLogic {
    private static Scanner sc = new Scanner(System.in);

    public void preAndPostDifference()
    {
        int x = 5;
        int y = 10;

        System.out.println("The value of x is " + x);
        System.out.println("The value of ++x is " + ++x);
        System.out.println("The value of x++ is " + x++);
        System.out.println("The value of x is " + x);

        System.out.println("The value of y is " + y);
        System.out.println("The value of --y is " + --y);
        System.out.println("The value of y-- is " + y--);
        System.out.println("The value of y is " + y);
    }
    public void booleanLogicShortCircuitOps(){
        boolean b =false;
        int x =3;
        if(x<0 && (b=true)){
            System.out.println(b);  //not executed
        }
        if(x>0 || (b=true)){
            System.out.println(b); // executed but b will still = false
        }
    }

    public void booleanBitwiseOps(){
        boolean b =false;
        int x =3;
        if(x<0 & (b=true)){
            System.out.println(b);  // not executed
        }
        if(x>0 | (b=true)){
            System.out.println(b); // executed and true will be assigned to refernce b.
        }
    }

    public void compareStrings(){
        String s1 = sc.next();
        String s2 = sc.next();

        if(s1==s2){
            System.out.println("s1==s2 " + (s1 == s2));
        }

        if(s1.equals(s2)){
            System.out.println("s1.equals(s2) " + s1.equals(s2));
        }

        System.out.println(s1.compareTo(s2));
    }

    public boolean admitToFilm(int aFilmCertification, int aPersonAge){
        if (aPersonAge >=aFilmCertification){
            return true;
        }
        return false;
    }

    // when detault move to the top of switch statment , it doesn't work properly
    public void switchVowelOrConstants(){
        char letter = sc.next().charAt(0);
        if((letter>='a' && letter<='z') || (letter>='A' && letter<='Z')){
            switch (letter) {
                default:
                    System.out.println(letter + " is a Constant");
                    break;
                case 'a':
                case 65:
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'u':
                case 'U':
                case 'o':
                case 'O':
                    System.out.println(letter + " is a Vowel");
                    break;
            }
        } else{
            System.out.println( letter + "is invalid");
        }
    }

    public void ifMonth(){

        int month = sc.nextInt();
        final int JAN=1;
        final int FEB=2;
        final int MAR=3;
        final int APR=4;
        final int MAY=5;
        final int JUN=6;
        final int JUL=7;
        final int AUG=8;
        final int SEP=9;
        final int OCT=10;
        final int NOV=11;
        final int DEC=12;

        if (month == JAN){
            System.out.println("January");
        }else if (month == FEB){
            System.out.println("February");
        }else if (month == MAR){
            System.out.println("March");
        }else if (month == APR){
            System.out.println("April");
        }else if (month == MAY){
            System.out.println("May");
        }else if (month == JUN){
            System.out.println("June");
        }else if (month == JUL){
            System.out.println("July");
        }else if (month == AUG){
            System.out.println("August");
        }else if (month == SEP){
            System.out.println("September");
        }else if (month == OCT){
            System.out.println("October");
        }else if (month == NOV){
            System.out.println("November");
        }else if (month == DEC){
            System.out.println("December");
        }else {
            System.out.println("out of the range");
        }
    }

    public static void main (String[]args)
    {
        ConditionalLogic c = new ConditionalLogic();
       // c.preAndPostDifference();
        // // frist condition is not achieved
        // // second condition is achieved since x> 0 however b is still false
        //c.booleanLogicShortCircuitOps();
        //c.booleanBitwiseOps();
        // // s1==s2 result false -> since this condition check if both refernces point to same object(same memory location) which is not right
        // // s1.equals(s2) check that contents of both string objects are the same which is right.
        // // if the code say s1="Sean" and s2="Sean" that means both references point to same memry location.
       // c.compareStrings();

      /*  int filmLimitedAge = sc.nextInt();
        int myAge = sc.nextInt();
        boolean flag = c.admitToFilm(filmLimitedAge,myAge);
        if (flag){
            System.out.println("you can see the film");
        } else{
            System.out.println("you are not allowed to see this film");
        }*/

        //c.switchVowelOrConstants();


       /* System.out.println("Enter a month in this range(1-12):");
        c.ifMonth();*/


        int index = 0;
        boolean flag = true;
        boolean a = false;
        boolean b;
        b = (flag | ( (index++) == 0));
        b = (a | ( (index += 2) > 0));
        System.out.println (index);
    }



}
