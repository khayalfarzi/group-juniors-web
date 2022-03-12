package az.iktlab.groupjuniorsweb.controller;

import az.iktlab.groupjuniorsweb.exception.UserNotFoundException;
import az.iktlab.groupjuniorsweb.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/people")
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

    @PostMapping("/")
    public void addPerson(@RequestBody Person person) {
        people.add(person);
    }

    @PutMapping("/{id}")
    public void putPerson(@PathVariable Long id,@RequestBody Person person) {
        people.set(people.indexOf(getById(id)), person);
    }

    @PatchMapping("/{id}")
    public void patchPerson(@PathVariable Long id, @RequestBody Person person) {
        people.set(people.indexOf(getById(id)), person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        Person person = getById(id);
        people.remove(person);
    }
}
