public class MySingletonClass {


    private static MySingletonClass dbConnection = new MySingletonClass();

    private  MySingletonClass(){
    }

    public static MySingletonClass getDbConnection(){
        return dbConnection;
    }
}