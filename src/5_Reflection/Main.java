import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Bird {

    private String breed;
    public String color;
    private String birdClass;

    public void setBird(String ipBreed, String ipColor) {
        this.breed = ipBreed;
        this.color = ipColor;
    }

    private void getMessage() {
        System.out.println("This is a private method for the class bird");
    }

    public void getBird() {
        System.out.println("Bird data is : " + this.breed + " : " + this.color + " " + this.birdClass);
    }

    public static void main(String args[]) throws NoSuchFieldException, IllegalAccessException {
        // 1. Way of creating an instance of Class , Class object
        Class myClassObj1 = Bird.class;

        try {
            Class myClassObj2 = Class.forName("Bird");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found Exception : " + ex);
        }

        Bird myBirdObj = new Bird();
        Class myClassObj3 = myBirdObj.getClass();

        // 2. Doing Relection of Class data members
        Class myClassObj4 = Bird.class;
        System.out.println(myClassObj4.getName());
        System.out.println(myClassObj4.getModifiers());
        System.out.println(myClassObj4.getFields());

        // getFields only return public method of the class under examination and all
        // its super class and interfaces
        Field[] myClassFields1 = myClassObj4.getFields();
        for (Field myField : myClassFields1) {
            // here myField is an object
            System.out.println(myField);
        }

        Field[] myClassFields2 = myClassObj4.getDeclaredFields();
        for (Field myField : myClassFields2) {
            System.out.println(myField.getName());
        }

        Field myField1 = myClassObj4.getDeclaredField("breed");
        Bird myBirdObj2 = new Bird();
        myField1.set(myBirdObj2, "brown king");
        myBirdObj2.getBird();

        // Setting the private method of private data members
        myField1 = myClassObj4.getDeclaredField("birdClass");
        // myField1.setAccessible(true);
        // here I was not getting error private acess error ???
        myField1.set(myBirdObj2, "Class 1");
        myBirdObj2.getBird();
    }

}

class MySingletonClass {

    // If it is not static final , it cause infinite call stack , which leads to
    // stack over flow error
    private static final MySingletonClass myConnection = new MySingletonClass();

    private MySingletonClass() {
        System.out.println("I am private Constructor ");

        /* For safeguarding the singleton class from Reflection */
        // below code can be uncommented
        // if (myConnection != null) {
        // throw new RuntimeException("Restricting usage of Singleton Class");
        // }
    }

    public MySingletonClass getConnection() {
        return MySingletonClass.myConnection;
    }

    public void message() {
        System.out.println("Accessing object of Single Ton Class");
    }
}

public class Main {
    public static void main(String[] args)
            throws NoSuchFieldException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Bird myBird = new Bird();
        Class myBirdClassObj = Bird.class;
        Field myField = myBirdClassObj.getDeclaredField("birdClass");
        myField.setAccessible(true);
        myField.set(myBird, "Class 1");
        myBird.getBird();

        // 3. Reflection of the Class methods
        Class myBirClassObj2 = Bird.class;
        Method[] myMethods2 = myBirClassObj2.getMethods();
        for (Method myMethod : myMethods2) {
            System.out.println(myMethod.getName());
            System.out.println(myMethod.getParameterTypes());
            System.out.println("***");
            System.out.println();
        }

        myMethods2 = myBirClassObj2.getDeclaredMethods();
        for (Method myMethod : myMethods2) {
            System.out.println(myMethod.getName());
            // System.out.println(myMethod.getParameterTypes());
            System.out.println(myMethod.getReturnType());
            System.out.println("###");
            System.out.println();
        }

        // 4. Reflection of the Constructor
        // creating more the one object of singleton class using constructor

        Class mySingleClassObj = MySingletonClass.class;
        Constructor[] myConstructors = mySingleClassObj.getDeclaredConstructors();
        for (Constructor myConstructor : myConstructors) {

            myConstructor.setAccessible(true);
            MySingletonClass newObj = (MySingletonClass) myConstructor.newInstance();
            newObj.message();
        }

    }
}