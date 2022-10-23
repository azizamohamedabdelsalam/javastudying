public class Armstrong {

    public int getDigitsCount (int target){
        int n=0;
        while (target != 0){
            n++;
            target=target/10;
        }
        return n;
    }

    public int power(int base, int exponent){
     /*   int result = 1;
        for (int i=1; i<= exponent; i++){
            result  = result * base;
        }
        return result;*/
        if(exponent ==0) return 1;
        if(exponent%2 ==0) return (power(base, exponent/2) * power(base, exponent/2) );
        return (base * power(base, exponent/2) * power(base, exponent/2) );
    }

    public boolean isArmstrong(int x){
       int n = getDigitsCount(x);
        int sum =0 ;
        int temp=x;
        while (temp!=0){
            int r = temp%10;
            sum  = sum + power(r,n);
            temp = temp/10;
        }
        return (sum == x);
    }
}
