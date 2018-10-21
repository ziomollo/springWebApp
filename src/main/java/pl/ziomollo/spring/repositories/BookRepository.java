package pl.ziomollo.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.ziomollo.spring.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
