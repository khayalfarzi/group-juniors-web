package az.iktlab.groupjuniorsweb.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

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
            nullable = false,
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
            columnDefinition = "Boolean default true")
    private Boolean isActive = true;

    @OneToOne(fetch = FetchType.LAZY,
            targetEntity = UserEntity.class,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;

    @OneToMany(fetch = FetchType.EAGER,
            targetEntity = ImageEntity.class,
            cascade = CascadeType.ALL)
    @JoinTable(name = "person_images", schema = "sc_juniors",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "image_id",
                    referencedColumnName = "id"))
    private List<ImageEntity> images;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
}