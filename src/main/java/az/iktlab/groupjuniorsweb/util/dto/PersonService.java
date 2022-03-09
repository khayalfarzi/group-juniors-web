package az.iktlab.groupjuniorsweb.util.dto;

import java.time.LocalDateTime;

public class PersonService {

    public void add(PersonDto personDto) {

        PersonEntity personEntity = new PersonEntity();
        personEntity.setName(personDto.getName());
        personEntity.setId(1L);
        personEntity.setCreatedAt(LocalDateTime.now());
        personEntity.setUpdatedAt(LocalDateTime.now());

        DB.add(personEntity);
    }
}
