package hashmap;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RunClass {
   static  Map<String,Product> productByName = new HashMap<>();
    public static void main (String[]args) { //  Main class or the user
        Product eBike = new Product("Bike1","a Bike with a batarrey");
        Product rBike = new Product("Bike2","a Bike for Composition");
        Product rBike2 = new Product("Bike2","a Bike for Composition better");
        // Put

        productByName.put(eBike.getName() , eBike);
        productByName.put(rBike.getName() , rBike);
        productByName.put(rBike2.getName() , rBike2);
// Put operation : When we add an element to the map, HashMap calculates the bucket. If the bucket already contains a value, the value is added to the list (or tree) belonging to that bucket. If the load factor becomes bigger than the maximum load factor of the map, the capacity is doubled.
        // Get
        Product newProduct = productByName.get("Bike2");
        assertEquals("a Bike for Composition better",newProduct.getDescription());
// Get operation : When we want to get a value from the map, HashMap calculates the bucket and gets the value with the same key from the list (or tree).
        boolean flagKey = productByName.containsKey("Bike2");
        System.out.println(flagKey);

        //Iterating
        for(Map.Entry<String,Product> entry: productByName.entrySet()){
            Product p = entry.getValue();
            String key = entry.getKey();
            System.out.println(key + " " + p.getDescription());
        }
        //Class as a key for example Product class is the key
        HashMap<Product, Integer> priceByProduct = new HashMap<>();
        priceByProduct.put(eBike, 900);
        for(Map.Entry<Product, Integer> entry: priceByProduct.entrySet()){
            Product p = entry.getKey();
            System.out.println("");
            System.out.println(p.getName() + " " + p.getDescription() + " " + entry.getValue() );
        }
    }
}
