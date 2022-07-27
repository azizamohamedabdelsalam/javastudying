
import java.util.List;



class Secondprogram {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        int pairSockCount = 0;



        while (ar.size()>0){
            for(int i=0; i<ar.size(); i++){
                int currentpairSockCount = pairSockCount;
                if (isOddCount(ar.get(i),ar)){
                    ar.remove(i);
                    break;
                }
                else {
                    int j=i+1;
                    while (j<ar.size()){
                        if (ar.get(i)==ar.get(j)){
                            pairSockCount ++;
                            ar.remove(j);
                            ar.remove(i);
                            break;
                        }
                        j++;
                    }
                    if (currentpairSockCount != pairSockCount) break;
                }}

        }
        return pairSockCount;
    }

    public static boolean isOddCount(Integer selectedElement,List<Integer> inAr){

        int count = 0;
        for (int i = 0; i < inAr.size(); i++) {
            if ( selectedElement == inAr.get(i)) {
                count++;
            }
        }
        if (count % 2 ==0){
            return false;
        }
        else {
            return true;
        }

    }
}


