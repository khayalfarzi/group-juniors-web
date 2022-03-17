package az.iktlab.groupjuniorsweb.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "person", schema = "sc_juniors")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Long id;

    @Column(name = "person_name",
            columnDefinition = "varchar default 'UNDEFINED'",
            length = 32,
//            nullable = false,
            unique = true)
    private String name;

    @Column(name = "person_surname")
    private String surname;

    @Column(name = "person_age")
    private Byte age;

    @Column(name = "person_gender")
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Column(name = "is_active",
            columnDefinition = "Boolean default true"
//            nullable = false
    )
    private Boolean isActive;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
}