package az.iktlab.groupjuniorsweb.controller;

import az.iktlab.groupjuniorsweb.exception.UserNotFoundException;
import az.iktlab.groupjuniorsweb.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final List<Person> people = new ArrayList<>();

    @GetMapping("/")
    public List<Person> getAll() {
        return people;
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable Long id) {
        return people.stream().filter(person -> Objects.equals(person.getId(), id))
                .findAny().orElseThrow(() -> new UserNotFoundException("Not found" + id));
    }

    @PostMapping("/add")
    public void add(@RequestBody Person person) {
        people.add(person);
    }

    @PutMapping("/put")
    public void put(@RequestBody Person person) {
        people.set(people.indexOf(person), person);
    }

    @PatchMapping("/patch")
    public void patch(@RequestBody Person person) {
        people.set(people.indexOf(person), person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        Person person = getById(id);
        people.remove(person);
    }
}
