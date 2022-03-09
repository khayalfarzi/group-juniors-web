package az.iktlab.groupjuniorsweb.controller;

import az.iktlab.groupjuniorsweb.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/hello")
    public String get() {
        return "Hello Java Spring ";
    }

    @PostMapping("/hello")
    public void post(@RequestParam("v") String value,
                     @RequestParam String name) {
        System.out.println(value);
        System.out.println(name);
    }

    @PutMapping("/hello/{id}")
    public void put(@PathVariable Long id) {
        System.out.println(id);
    }

    @PatchMapping("/hello")
    public void patch(@RequestBody Person person) {
        System.out.println(person);
    }

    @DeleteMapping("/hello/{id}/{surname}")
    public Person delete(@PathVariable Long id,
                         @RequestParam String name,
                         @PathVariable String surname) {

        return new Person(id, name, surname);
    }
}