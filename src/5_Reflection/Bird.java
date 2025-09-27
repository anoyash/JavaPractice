import java.lang.reflect.Field;

public class Bird {

    public String breed;
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

        // 3. Reflection of Class methods
    }

}