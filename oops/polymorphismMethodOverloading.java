package oops;

import static java.awt.AWTEventMulticaster.add;

public class polymorphismMethodOverloading {
    public static void main(String[] args) {
     //method calling for addtion integer
       int result = add(5,6);  // 4 + 12 = 16 bytes
        double resultValue = add( 2.5,9.3);  // 8 + 24= 32 bytes
        System.out.println("M1 " + result + "M2 " + resultValue);

       /*  // 4 + 12 = 16 bytes
          // 8 + 24= 32 bytes
        System.out.println("M1 " + add(5,6) + "M2 " + add( 2.5,9.3));   //space complexity reduce
        */

    }

    private static double add(double v, double w )  {
        // double value = v + w;
        return v + w;      // result return int datatype
    }

    private static int add(int i , int i1 ){
       // int a = i + i1;
        return i + i1;
    }
}
