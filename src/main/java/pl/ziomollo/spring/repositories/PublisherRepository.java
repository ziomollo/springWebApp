package pl.ziomollo.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.ziomollo.spring.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
