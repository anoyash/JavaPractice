public class Student {

    int rollNum;
    int classNum;
    String name;
    String[] subjects = new String[5];

    public static void main(String args[]) {
        Student myStudent1 = new Student();
        Student myStudent2 = new Student(1, 12, "Ashutosh");

        myStudent1.getStudent();
        System.err.println("\n\n");
        myStudent2.getStudent();
    }

    Student() {
        rollNum = 0;
        this.classNum = 0;
        this.name = "Dummy";
    }

    Student(int ipRoll, int ipClassNum, String ipName) {
        rollNum = ipRoll;
        classNum = ipClassNum;
        name = ipName;
    }

    public void setStudent(int ipRoll, int ipClassNum, String ipName) {

    }

    public void getStudent() {

        System.out.println("Name of Student  : " + this.name);
        System.out.println("Class of Student : " + this.classNum);
        System.out.println("Roll Num of Student : " + this.rollNum);
    }

}
