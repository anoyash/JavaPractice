/*
 * For Demonstration of Abstract Class ( 0 to 100 % abstractio)
 */

public abstract class Car {

    int mileage;

    Car(int ipMileage) {
        System.out.println("I am inside Car Contructor ");
        this.mileage = ipMileage;
    }

    public abstract void reduceMileage();

    public abstract boolean incrMileage();

    public static void main(String[] args) {
        Car audi1 = new Audi(10);
        LuxuryCar audi2 = new Audi(11);
        Audi audi3 = new Audi(12);
    }
}

abstract class LuxuryCar extends Car {

    LuxuryCar(int mileage) {
        super(mileage);
        System.out.println("I am inside Luxury Car constructor ");
    }

    abstract void getMileage();
}

class Audi extends LuxuryCar {

    Audi(int mileage) {
        super(mileage);
        System.out.println("I am inside Audi constructor");
    }

    public void reduceMileage() {
        mileage -= 1;
    }

    public boolean incrMileage() {
        mileage += 1;
        return true;
    }

    public void getMileage() {
        System.out.println("Mileage of the car : " + mileage);
    }
}
