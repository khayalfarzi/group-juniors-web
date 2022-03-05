package az.iktlab.groupjuniorsweb.util.dto;

import java.util.ArrayList;
import java.util.List;

public class DB {

    private static final List<PersonEntity> people =
            new ArrayList<>();

    public static void add(PersonEntity person) {
        people.add(person);
    }

    public static List<PersonEntity> get() {
        return people;
    }
}