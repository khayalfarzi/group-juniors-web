package az.iktlab.groupjuniorsweb.util.singleton;

public class Connection {

    private static Connection instance;

    private Connection() {
        System.out.println("constructor is working");
    }

    public static Connection getInstance() {
        instance = instance == null ? new Connection() : instance;
        return instance;
    }
}