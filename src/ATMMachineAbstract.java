public class ATMMachineAbstract {
    public void enter_Card ()
    {
        System.out.println ("Card Verification");
    }

    public void enter_PIN ()
    {
        System.out.println ("Pin Verification");
    }

    public void withdraw_Cash ()
    {
        System.out.println ("To withdraw cash from ATM");
        Validate_Withdraw_Amount ();
        Update_Amount ();
        dispose_Cash ();
    }

    private void Validate_Withdraw_Amount ()
    {
        System.out.println ("Validate the Amount to be withdraw");
    }

    private void Update_Amount ()
    {
        System.out.println ("Update the Amount after withdraw");
    }

    private void dispose_Cash ()
    {
        System.out.println ("Dispose the cash from ATM");
    }

    public void Mini_Statement ()
    {
        System.out.println ("Get the mini statement");
    }
//As you can see in the above code, the necessary methods and properties are exposed by using the “public” access modifier whereas the unnecessary methods and properties are hidden from outside the world by using the “private” access modifier. We made the following methods private, so they are not exposed to the user of the ATMMachine class. As part of the Cash_Withdrawal, we need to put the required logic to call methods.

    //Now, we are exposing the necessary methods (Enter_Card, Enter_Pin, and Cash_Withdrawal) to the outside world or to the user of the ATMMachine class by hiding its implementation details or the Complexity (Validate_Withdraw_Amount, Update_Amount, and Cash_Dispose). This is called abstraction in Java.
    //
    //Advantages of Abstraction in Java:
    //It reduces the complexity of viewing things and increases the readability of the code.
    //Helps to increase the security of an application or program as only important details are provided to the user.
}
