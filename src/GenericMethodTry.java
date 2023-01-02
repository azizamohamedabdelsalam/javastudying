
public class GenericMethodTry {

    public static <T> boolean isEqual(GenericsTypeClass<T> g1, GenericsTypeClass<T> g2){
       return g1.get().equals(g2.get());
    }

    public static void main(String args[]){

        GenericsTypeClass<String> g1 = new GenericsTypeClass<>();
        g1.set("Hello");
        GenericsTypeClass<String> g2 = new GenericsTypeClass<>();
        g2.set("Hello");

        boolean isEqualFlag = GenericMethodTry.<String>isEqual(g1,g2);

        System.out.println(isEqualFlag);


        // Test Raw Type generic which means i don't determine parameter data type

        GenericsTypeClass g3 = new GenericsTypeClass<>();
        g3.set("10");
        GenericsTypeClass g4 = new GenericsTypeClass<>();
        g4.set(10);

        boolean isEqualFlag2 = GenericMethodTry.<String>isEqual(g3,g4);

        System.out.println(isEqualFlag2);

    }
}
