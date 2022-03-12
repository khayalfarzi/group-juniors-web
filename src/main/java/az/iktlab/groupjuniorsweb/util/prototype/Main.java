package az.iktlab.groupjuniorsweb.util.prototype;

public class Main {
    public static void main(String[] args) {

        Person personOne = Person.builder().id(1)
                .url("jdbc:postgresql://localhost:5432/postgres")
                .username("root")
                .password("123456")
                .port(5432)
                .build();
        System.out.println(personOne);

        Person personTwo = personOne.clone();
        personTwo.setId(2);
        personTwo.setUrl("jdbc:mysql://localhost:3306/mysql");
        personTwo.setPort(3306);
        System.out.println(personTwo);

    }
}
