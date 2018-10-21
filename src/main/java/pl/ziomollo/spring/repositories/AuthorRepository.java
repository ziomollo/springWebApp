package pl.ziomollo.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.ziomollo.spring.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
