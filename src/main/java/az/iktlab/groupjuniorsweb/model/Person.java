package az.iktlab.groupjuniorsweb.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Person {

    Long id;
    String name;
    String surname;

}
