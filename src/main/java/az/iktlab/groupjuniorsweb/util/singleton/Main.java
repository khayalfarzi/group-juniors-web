package az.iktlab.groupjuniorsweb.util.singleton;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 1000000000; i++) {
            Connection conn = Connection.getInstance();
        }

    }
}
