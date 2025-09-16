
// 1st : Below is the implementation of eager initialization
// public class MySingletonClass {

// /* This is eager initialization */
// private static MySingletonClass dbConnection = new MySingletonClass();

// private MySingletonClass() {
// System.out.println("constructor is called ");
// }

// public static MySingletonClass getDbConnection() {
// return dbConnection;
// }

// public static void main(String args[]) {
// MySingletonClass myDbConnect = MySingletonClass.getDbConnection();
// System.out.println(myDbConnect);
// }
// }

// 2nd : Implementation of Lazy initialization
