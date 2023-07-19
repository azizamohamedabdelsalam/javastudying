public class WrapperDemo {
    public static void main(String[]args){
      /*  String i="10";
        int k= Integer.parseInt(i);
        double m = Double.parseDouble("10");
        System.out.print(k);
        System.out.print(m);
        boolean status=Boolean.parseBoolean("20");
        System.out.print(status);
        */
        // learning Wrapper class
        /*Note that, the instances of the classes point to the memory locations assigned in the heap and themselves do not hold the value. While we are creating objects with the help of the constructor of the wrapper class, each time a new memory is allocated in the heap and the objects point to the different memory locations. Hence, in the above example, In this case, both num1 and num2 are pointing to different memory locations, thus on the comparison, they return false.

                Do note is not so in the case of the valueOf() method as the valueOf() method checks if any memory is allocated to the same value for that class in the heap. If it finds the value, then it provides the location of the previously allotted memory to the new instance and both start pointing to the same memory location in the heap. Hence, on the comparison, it returns true.

                Since the wrapper class object’s values are immutable just like String and thus can not be changed once allotted, it does not affect how many instances are pointing to the same memory location. Hence, in the above example, the memory was allotted to value 5 and the num3 was pointing to that memory location, but when we created one more instance num4 with the same value, it also started pointing to the same memory location as pointed by num3.

        Currently, the method using a constructor to create an instance is deprecated, and therefore it is always best to use the valueOf() method.*/
        Integer num1 = new Integer(5);
        Integer num2 = new Integer (5);
        Integer num3 = Integer.valueOf(5);
        Integer num4 = Integer.valueOf(5);

        boolean x = (num1== num2);
        boolean y = (num3== num4);

        System.out.println(x);
        System.out.println(y);
    }
}
