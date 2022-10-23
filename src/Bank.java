abstract class Bank {
    abstract int getRateofInterest();
}
class CIB extends Bank {
    int getRateofInterest(){
        return 7;
    }
}

class HSBC extends Bank {
    int getRateofInterest(){
        return 4;
    }
}
