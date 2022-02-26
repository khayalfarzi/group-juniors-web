package az.iktlab.groupjuniorsweb.controller;

import az.iktlab.groupjuniorsweb.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final List<Person> people = new ArrayList<>();

    @GetMapping("/all")
    public List<Person> getAll() {
        return people;
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable Long id) {
        for (Person person : people) {
            if (Objects.equals(person.getId(), id))
                return person;
        }
        return null;
    }

    @PostMapping("/add")
    public void add(@RequestBody Person person) {
        people.add(person);
    }

    // write put patch and delete methods
}
