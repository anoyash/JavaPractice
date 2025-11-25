
// 1st : Below is the implementation of eager initialization
public class MySingletonClass {

    /* This is eager initialization */
    private static MySingletonClass dbConnection = new MySingletonClass();

    private MySingletonClass() {
        System.out.println("constructor is called ");
    }

    public static MySingletonClass getDbConnection() {
        return dbConnection;
    }

    public static void main(String args[]) {
        MySingletonClass myDbConnect = MySingletonClass.getDbConnection();
        System.out.println(myDbConnect);
    }
}

/**********/

// 2nd : Implementation of Lazy initialization
public class MySingletonClass {

    private static MySingletonClass myDbConnection;

    private MySingletonClass() {

    }

    public static MySingletonClass getDbConnection() {
        if (myDbConnection == null) {
            myDbConnection = new MySingletonClass();
        }
        return myDbConnection;
    }

    public static void main(String[] args) {
        MySingletonClass myConnectionObj = MySingletonClass.getDbConnection();
        System.out.println(myConnectionObj);
    }
}

/**********/
// 3rd : Synchorized initialization : In case of multi core and multi thread is
// there it will put lock and un-lock
public class MySingletonClass {

    private static MySingletonClass myDbConnection;

    MySingletonClass() {
    }

    synchronized public static MySingletonClass getDbConnection() {

        if (myDbConnection == null) {
            myDbConnection = new MySingletonClass();
        }
        return myDbConnection;
    }

    public static void main(String[] args) {
        MySingletonClass dbConnection = MySingletonClass.getDbConnection();
        System.out.println(dbConnection);
    }
}