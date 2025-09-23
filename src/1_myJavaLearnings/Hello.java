/*
 * This file contains the example 
 * 1. Basic JAVA class syntax with main method
 * 2. Example of primitive data types in JAVA and the examples of Primitive Data types.
 */

public class Hello {
    public static void main(String[] args) {

        // JVM needs a main method , it uses it as a entry point to our Java application

        String myText = "Hello World, AShutosh Here !!";
        System.out.println(myText);
        
        myPrimitiveData(args);  // demostrating the primitive data type usage
        
        typeCasting(args);      // demostrating the type casting in java 
    }

    public static void myPrimitiveData(String args[]){
        // defining all the types of primitive data types

        // Integer Family 
        byte  num1 = 1;
        short num2 = 10;
        int   num3 = 100;
        long  num4 = 100000;

        //long long myNum;  --- this type of declaration does not work in java 
        //long long int myNum2; --- this type of declaration does not work in java 

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        // Floating point family 
        float num5 = 1.25f;    
        // for java we need to explicity give f for type conversion. Since, by default JAVA assumes decimal number
        // to be a double , so type mismatch error will come : cannot convert double to float. 

        double num6 = 1233.445;
        System.out.println(num5);
        System.out.println(num6);

        // Character family 
        char myInitials = 'A';
        /*
         * In JAVA char is of 2 bytes and it follows UNICODE , it helps in supporting vast range of characters
         * In C/CPP char is of 1 byte and it follows ASCII codes , C++ 11 onwards it provides some support for UNICODE as well
         */
        System.out.println(myInitials);

        // Boolean family 
        boolean isTapOn = true;
        // isTapOn = 1; This is wrong syntax compiles throws Type mismatch error : cannot convert int to boolean

        if (isTapOn){
            System.out.println("Tap is On");
        }else
        {
            System.out.println("Tap is Off ! Kindly On it to get the water");
        }
    }

    public static void typeCasting(String[] args) {

        // small range also refers to small space provided to store the data in memory
        // bigger range also refers to bigger space provided to store the data in memory

        // Widening or Automatic Implicit Conversion
        // byte -> short -> int -> long -> float -> double 

        //Narowing or Explicit Conversion
        // Double -> float -> long -> int -> short -> byte 

        byte num1 = 10;
        int  num2 = 125;

        // num1 = num2; this will throw error cannot convert byte to interger 
        // because we are trying to assign bigger range value in a small range value and it can lead to lossy conversion.

        num1 = (byte) num2; // explicit casting we are doing here 
        
        num2 = num1 ;       // here we dont require the explicit conversiom , because we are trying to assign small range value in
        // a long range value 
        
        byte num3 = 30;

        num2 = num1 * num3; // Here type promotion will happen , because after multiplication 300 is out of range for byte.
        // so normally byte * byte should be byte , but since it is out of range, it will promote it to integer

        float num4 = 5.6f;

        num2 = (int)num4; // explicit type casting 
        // num2 = num4; // this will give Type mismatch error

        num4 = num2; // this is allowed , I am able to assign int to float.

        long num5 = 20L;

        num4 = num5;

        // num5 = num4; // this is not allowed , since we cannot convert

        //modulo conversion If we for fully do implicit conversion of bigger range value in small
        // byte is having upper limit of 127

        byte num6;

        // num6 = 128; it will give error cannot convert int to byte
        num6 = (byte)130;
        
        System.out.println(num6);
        System.out.println("Converted implicit conversion of bigger bucket value to small : "+num6);
    }
}
