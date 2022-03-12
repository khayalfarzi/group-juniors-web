package az.iktlab.groupjuniorsweb.util.prototype;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person implements Cloneable{
    int id;
    String url;
    String username;
    String password;
    int port;

    @Override
    public Person clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
