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
        // Way of creating an instance of Class , Class object
        Class myClassObj1 = Bird.class;
        Class myClassObj2 = Class.forName("Bird");

        Bird myBirdObj = new Bird();
        Class myClassObj3 = myBirdObj.getClass();

    }

}