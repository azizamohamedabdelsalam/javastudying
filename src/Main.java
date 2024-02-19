public class Main {
    public static void main (String[]args){ //  Main class (or the user of the ATMMachine class)
        ATMMachine am = new ATMMachine ();
        //Accessing the Public Properties and methods
        am.enter_Card();
        am.enter_PIN();
        am.withdraw_Cash();
        am.Validate_Withdraw_Amount();
        am.Update_Amount();
        am.Dispo_Cash();

//let us  analyze the code. Do, we really need to call the following three methods manually.
            //Validate_Withdraw_Amount();
            //Update_Amount();
            //Cash_Dispose();
// The way we have implemented the code in our ATMMachine class if the withdrawal amount is less than the available balance, then also it is going to perform the withdrawal operation. At the same time, the user of the ATMMachine class may forget to call some of the methods as shown in the below code.
        //ATMMachine am = new ATMMachine ();
        //      //Accessing the Public Properties and methods
        //      am.Enter_Card();
        //      am.Enter_Pin();
        //      am.Cash_Withdrawal();
        //      am.Cash_Dispose();
//      Because we are not following the Abstraction Principle. As we made all the methods public, so the user of the ATMMachine class can access all these methods.

        ATMMachineAbstract amAbstract = new ATMMachineAbstract ();
        //Accessing the Public Properties and methods
        amAbstract.enter_Card();
        amAbstract.enter_PIN();
        amAbstract.withdraw_Cash();


        ///abstract class and conceret class

        Bank b;
        b=new CIB();
        System.out.println(b.getRateofInterest());
        b = new HSBC();
        System.out.println(b.getRateofInterest());


    }
}
