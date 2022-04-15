package az.iktlab.groupjuniorsweb;

import az.iktlab.groupjuniorsweb.dao.entity.Gender;
import az.iktlab.groupjuniorsweb.dao.entity.PersonEntity;
import az.iktlab.groupjuniorsweb.dao.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class GroupJuniorsWebApplication {

    private final PersonRepository repo;

    public GroupJuniorsWebApplication(PersonRepository repo) {
        this.repo = repo;
    }

    public static void main(String[] args) {

        SpringApplication.run(GroupJuniorsWebApplication.class, args);
    }

//    @PostConstruct
    public void postCons() {
        PersonEntity person = PersonEntity.builder()
                .age((byte) 23)
                .gender(Gender.MALE)
                .name("Name1")
                .surname("Namezade")
                .build();

        repo.save(person);
    }
}