/*
 * Concrete Class are those for which object can be created using NEW Keyword
 * It has all his methods implemented
 * Child Class can also be concrete , either it is extended from the abstract
 * class or implemented from the interface
 * It can be public or package private
 */

public class Concrete {

    int datamember1;
    int datamember2;
    String name;

    public static void main(String[] args) {
        System.out.println(" I am in main method of Concrete class");
    }

    public void setConcrete(int ipMember1, int ipMember2, String ipName) {
        this.datamember1 = ipMember1;
        this.datamember2 = ipMember2;
        this.name = ipName;
    }

    public void getConcrete() {
        System.out.println(datamember1 + " : " + datamember2 + " : " + name);
    }
}

interface Shape {

    public void returnShape();

}

/*
 * Class Rectangle can also be concrete class
 */

class Rectangle implements Shape {

    @Override
    public void returnShape() {
        System.out.println("I am a rectangle shape");
    }
}