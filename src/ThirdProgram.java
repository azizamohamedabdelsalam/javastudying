public class ThirdProgram {

    private String startMethod= "Dog";
    public void start(){
        System.out.println(startMethod + " is an Animal") ;
            }

    public void start(String method){
        this.startMethod =method;
        System.out.println(startMethod + " is an Animal") ;
    }
    public static void main(String args[]){
//Continue
     /*   for(int i=0; i<=10; i++){
            if(i%2==0) continue;
            System.out.print(i + " ");
        } */
//Return
      /*  boolean t=true ;
        System.out .println("no issue");

        if (t) return;
        System.out .println("don't executed");*/
//Method overloading
      /*  ThirdProgram animal = new ThirdProgram() ;
        animal.start();
        animal.start("Cat");
*/
        int y = 1/2;
        System.out.println(y);
        Armstrong ob = new Armstrong();
        int x = 153;
        System.out.println(ob.isArmstrong(x));
        x = 1253;
        System.out.println(ob.isArmstrong(x));


    }
}
