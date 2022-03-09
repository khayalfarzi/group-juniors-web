package az.iktlab.groupjuniorsweb.util.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    Long id;
    String name;
    String surname;
    int age;
}
