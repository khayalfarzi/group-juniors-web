package az.iktlab.groupjuniorsweb.util.builder;

public class Main {

    public static void main(String[] args) {
        Person person = Person.builder()
                .id(1L)
                .name("name")
                .surname("Surname")
                .age(234)
                .build();

        System.out.println(person);
    }
}
