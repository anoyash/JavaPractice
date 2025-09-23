public class Bird {

    public static void main(String args[]) {
        System.out.println("Interface demonstration has been started ");
        BirdTemplate myBird1 = new Eagle();
        myBird1.fly();
    }
}

interface BirdTemplate {
    int max_height = 10; // by implicityl it is public static final int max_height = 10;

    public void fly();

    public void eat();

    public void sleep();
}

interface BirdTemplate2 extends BirdTemplate {
    void fly2();
}

class Eagle implements BirdTemplate {

    public void fly() {
        System.out.println("Eagle is flying ");
    }

    public void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Eagle is sleeping");
    }
}

interface WaterAnimal {
    public void canBreathe();
}

interface LandAnimal {
    public void canBreathe();
}

/*
 * Diamond problem of inheritence is resolved using inheritence
 */
class Crocodile implements WaterAnimal, LandAnimal {
    @Override
    public void canBreathe() {
        System.out.println("Crocodile can do the breathing");
    }
}