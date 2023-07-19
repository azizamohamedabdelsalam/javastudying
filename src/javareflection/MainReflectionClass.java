package javareflection;

import java.lang.reflect.*;
public class MainReflectionClass {
    public static void main(String args[])
    {
        try {
            Class c = Class.forName("java.lang.String");
            Method m[] = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++)
                System.out.println(m[i].toString());
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }

}
