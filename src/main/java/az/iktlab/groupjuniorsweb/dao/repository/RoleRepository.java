package az.iktlab.groupjuniorsweb.dao.repository;

import az.iktlab.groupjuniorsweb.dao.entity.Role;
import az.iktlab.groupjuniorsweb.model.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}