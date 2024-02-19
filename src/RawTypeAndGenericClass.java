import java.util.ArrayList;

/**
 * @author created: aabdelsalam on 2024-01-22 13:15
 * @author last change: $Author: $ on $Date: $
 * @version $Revision: $
 */
public class RawTypeAndGenericClass<T> {

    private T item;

    public RawTypeAndGenericClass(T item)
    {
        this.item= item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T aItem) {
        this.item = aItem;
    }

    public static void main(String... start) {
        RawTypeAndGenericClass<String> stringClassObject = new RawTypeAndGenericClass<>("String Object");
        RawTypeAndGenericClass rawClassObject = new RawTypeAndGenericClass("Raw Object"); // using Raw Type

        String str = stringClassObject.getItem();
        String raw =(String) rawClassObject.getItem();

        ArrayList rawList = new ArrayList();
        rawList.add("hello");
        rawList.add(42);

        for (Object item : rawList) {

            if (item instanceof String) {
                System.out.println("String");
            } else if (item instanceof Integer){
                System.out.println("Integer");
            }
        }
    }
}
