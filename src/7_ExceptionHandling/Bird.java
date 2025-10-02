/*
 * Exception object has exception message and call stack that will tell where exactly exception has happened
 * 
 */
public class Bird {

    public static void main(String args[]) {
        // 1. Arithmetic exception
        // method1();

        // 2. Class cast exception : java.lang.ClassCastException
        // Object val = 0;
        // System.out.println((String) val);

        // 3. Array index out of bounds exception :
        // java.lang.ArrayIndexOutOfBoundsException
        // Integer[] myArray = new Integer[5];
        // System.out.println(myArray[1] + " " + myArray[5]);

        // 4. Nullpointer Exception
        // String val = null;
        // System.out.println(val);
        // System.out.println(val.charAt(0));

        try {
            method1();

        } catch (ArithmeticException ax) {
            System.out.println("Arithmetic Exception ");
        } catch (ClassCastException cx) {

        } catch (Exception ex) {
            // This is generic exception object, it can handle all the exception
            // This one should always be written in the last

        } finally {
            System.err.println("I am going to be executed always");
        }
    }

    public static void method1() {
        throw new ArithmeticException("Exception ho gya Ashutosh bhai..");
    }
}