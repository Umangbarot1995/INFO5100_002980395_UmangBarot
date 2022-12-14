package Singleton;

public class SingletonPattern {
    public static void main(String[] args) {

        // illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible
        // SingleObject object = new SingleObject();

        // Get the only object available
        Database object = Database.getInstance();

        // show the message
        object.getconnection();
    }
}