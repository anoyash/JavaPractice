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

        String val = null;
        System.out.println(val);
        System.out.println(val.charAt(0));
    }

    public static void method1() {
        throw new ArithmeticException("Exception ho gya Ashutosh bhai..");
    }
}