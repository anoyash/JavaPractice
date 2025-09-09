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
        System.err.println("\n");
        myStudent2.getStudent();
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

    public void setStudent(int ipRoll, int ipClassNum, String ipName) {

    }

    public void getStudent() {

        System.out.println("Name of Student     : " + this.name);
        System.out.println("Class of Student    : " + this.classNum);
        System.out.println("Roll Num of Student : " + this.rollNum);
    }

}
