public class Student {

    int rollNum;
    int classNum;
    String name;
    String[] subjects = new String[5];

    public static void main(String args[]) {

        String[] mySubjects = { "English", "Hindi", "Maths", "Science", "History" };
        Student myStudent1 = new Student();
        Student myStudent2 = new Student(1, 12, "Ashutosh", mySubjects);

        myStudent1.getStudent();
        System.out.println("\n");
        myStudent2.getStudent();
        System.out.println("\n");

        String myName = "Ashutosh";
        String myFullName = myName;
        myFullName = "Ashutosh Kumar";
        System.out.println("myName  : " + myName + " :: myFullName : " + myFullName);

        String myName1 = new String("Ashu");
        String myFullName1 = new String();
        myFullName1 = myName1;
        myFullName1 = "Tosh";
        System.out.println("myFullNam1 : " + myName1);

        Integer myNum = 10;
        Integer newNum = myNum; // this is a reference creation
        newNum = 12; // this will change the value in heap memory ,
        System.out.println("Value of newNum :" + newNum);
    }

    Student() {
        rollNum = 0;
        this.classNum = 0;
        this.name = "Dummy";
    }

    Student(int ipRoll, int ipClassNum, String ipName, String[] ipSubjects) {
        rollNum = ipRoll;
        classNum = ipClassNum;
        name = ipName;
        this.subjects = ipSubjects;
    }

    /*
     * This below method is not a constructor , Contructor does not have return
     * type.
     */
    public void Student(int ipRoll, int ipClassNum, String ipName, String[] ipSubjects) {
        rollNum = ipRoll;
        classNum = ipClassNum;
        name = ipName;
        this.subjects = ipSubjects;
    }

    public void setStudent(int ipRoll, int ipClassNum, String ipName) {
        rollNum = ipRoll;
        classNum = ipClassNum;
        name = ipName;
    }

    public void getStudent() {

        System.out.println("Name of Student     : " + this.name);
        System.out.println("Class of Student    : " + this.classNum);
        System.out.println("Roll Num of Student : " + this.rollNum);
    }

}
