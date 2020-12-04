package dk.kea.webshop.repository;

import dk.kea.webshop.model.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}
