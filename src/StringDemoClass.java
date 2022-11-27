public class StringDemoClass {
   static  String str="Hello World Again";
    static  char chararray[] = {'h','e','l','l','o'};
    //convert char array to string
    static String str2= new String (chararray);
    static String str3= new String("Hello World Again");
    static  String str4="Hello World Again";
    static String str5= new String("Hello World Again");
    public static void main(String args[]){
      //  System.out.println(str);
       // System.out.println(str2);
        //System.out.println(str3);
        //System.out.println(chararray);
        if (str == str3){
            System.out.println("equals");
        }
        if (str == str4){
            System.out.println("equals6");
        }
        if (str3.equals(str5)){
            System.out.println("equals7");
        }
    }

}
