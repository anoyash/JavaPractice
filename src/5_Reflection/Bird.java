public class Bird {

    public String breed;
    public String color;

    public void setBird(String ipBreed, String ipColor) {
        this.breed = ipBreed;
        this.color = ipColor;
    }

    private void getMessage() {
        System.out.println("This is a private method for the class bird");
    }

    public static void main(String args[]) {
        // 1. Way of creating an instance of Class , Class object
        Class myClassObj1 = Bird.class;

        try {
            Class myClassObj2 = Class.forName("Bird");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found Exception : " + ex);
        }

        Bird myBirdObj = new Bird();
        Class myClassObj3 = myBirdObj.getClass();

        // 2. Doing Relection of Class
        Class myClassObj4 = Bird.class;
        System.out.println(myClassObj4.getName());
        System.out.println(myClassObj4.getModifiers());

    }

}