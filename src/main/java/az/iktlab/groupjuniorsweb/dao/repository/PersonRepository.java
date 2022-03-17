package az.iktlab.groupjuniorsweb.dao.repository;

import az.iktlab.groupjuniorsweb.dao.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Long> {
}
