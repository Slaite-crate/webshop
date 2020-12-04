package dk.kea.webshop.repository;

import dk.kea.webshop.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
