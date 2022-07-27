import hashmap.Product;
import immutable.ImmutableClass;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class Firstprogram {
    public static void main(String args[]){
      /*  int x =0b1111;
        int y = 0X123Face;
        double decimalValue = 101.230; // decimal-form literal
        double decimalValue1 = 0123.222; // It also acts as decimal literal
        double hexaDecimalValue = 1.234e2; // Hexa-decimal form
        boolean boolVar1 = true;
        boolean boolVar2 = false;
        // boolean boolVar3 = 0; error: incompatible types: int cannot be converted to boolean
        // boolean boolVar1 = 1; error: incompatible types: int cannot be converted to boolean
        char ch1 = 'a';
        char ch2 = 073; //062 = 2
        char ch3 = '\u0061';
       // char ch4 = '\n';
        int z;
        double w = 2.5;
        z=(int)w;
        int a=6;
        int b=10;
        int c=a;
        a=b;
        //int c=a=b;
        int d= a%b;
        int ch41 = 10;
        int ch42 = 20;
        int ch43;

        System.out.println("Hello World");
        System.out.println("x = " + x);
        System.out.println("y = " +y);
        System.out.println("Decimal form literal is "+decimalValue);
        System.out.println("Second Decimal form literal is "+decimalValue1);
        System.out.println("Hexa decimal form literal is "+hexaDecimalValue);
        System.out.println(boolVar1);
        System.out.println(boolVar2);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
      //  System.out.println(ch4);
        System.out.println("z=" + z);
        System.out.println("w=" + w);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
        System.out.println("Hello World");
        System.out.println (ch43 = ch41); // Output =10
        System.out.println (ch42);
        System.out.println (ch42 += ch41); // Output=30
        System.out.println (ch42);
        System.out.println (ch42 -= ch41); // Output=20
        System.out.println (ch42);
        System.out.println (ch42 *= ch41); // Output=200
        System.out.println (ch42);
        System.out.println (ch42 /= ch41); // Output=2
        System.out.println (ch42);
        System.out.println (ch42 %= ch41); // Output=0
        System.out.println (ch42);
        System.out.println (ch42 ^= ch41); // Output=0
        System.out.println (ch42);
        String s="test";
        boolean result;
        result = s instanceof String;
        System.out.println(result);

        String st="abcdc";
        int strLength = st.length();
        System.out.println(strLength);
        String st1 = st.substring(0, (st.length()/2));
        String st2 = st.substring(st.length()/2);
        int st1Len = st1.length();
        int st2Len = st2.length();
        System.out.println(st1 + st1Len);
        System.out.println(st2 + st2Len);

        String stnew = "hello world i'm aziza";
        String[] parts = stnew.split(" ");
        for (int i=0; i<= parts.length-1; i++){
            System.out.println(parts[i]+parts[i].length());
        }

        int n = 7;

        List<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(40);

        int resultx = Secondprogram.sockMerchant(n, ar);

        System.out.println(resultx);
*/
        /*Hashmap*/
        Map<String, Product> productsByName = new HashMap<>();
        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product("Road bike", "A bike for competition");
        productsByName.put(eBike.getName(), eBike);
        productsByName.put(roadBike.getName(), roadBike);

        Product nextPurchase = productsByName.get("E-Bike");
        //assertEquals("A bike with a battery", nextPurchase.getDescription());

       // Product nextPurchase2 =productsByName.get("Car");
       // assertNull(nextPurchase);

        Product neweBike = new Product("E-Bike", "A bike with a battery4");
        productsByName.put(neweBike.getName(),neweBike);
        productsByName.put(null,neweBike);
       // assertSame(productsByName.get(null), productsByName.get("E-Bike"));


        //Product neweBike2 = new Product("E-Bike", "A bike with a battery3");
       //productsByName.put(null,neweBike2);
        //two elements with similar Key then get by key will target the last inserted value
        Product nextPurchase3 = productsByName.get(null);
        //assertEquals("A bike with a battery",nextPurchase3.getDescription());
        productsByName.forEach((key,product) -> {
            System.out.println("Key: " + key + " Product:" + product.getDescription());
        });
        /*------------------------------------*/
        /* Immutable class---------------------*/
        // Getting immutable class only with required parameters
        ImmutableClass immutableClass = new ImmutableClass.ImmutableClassBuilder(1, "Pankaj").build();

        HashMap<String,String> hm = new HashMap<String, String>();
        hm.put("Name", "Pankaj");
        hm.put("City", "San Jose");
        // Getting immutable class with optional parameters
        ImmutableClass immutableClass1 = new ImmutableClass.ImmutableClassBuilder(1, "Pankaj")
                .setCompany("Apple").setProperties(hm).build();

        //Testing immutability
        HashMap<String,String> hm1 = immutableClass1.getProperties();

        //lets modify the Object passed as argument or get from the Object
        hm1.put("test", "test");
        hm.put("test", "test");

        //check that immutable class properties are not changed
        System.out.println(immutableClass1.getProperties());
        /*-----------------------------------*/

    }
}
