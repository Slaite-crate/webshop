package dk.kea.webshop.controller;

import dk.kea.webshop.model.Product;
import dk.kea.webshop.repository.CategoryRepository;
import dk.kea.webshop.repository.CompanyDescriptionRepository;
import dk.kea.webshop.repository.CompanyRepository;
import dk.kea.webshop.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class RestProductController {

    private CategoryRepository categoryRepository;
    private CompanyRepository companyRepository;
    private CompanyDescriptionRepository companyDescriptionRepository;
    private ProductRepository productRepository;

    public RestProductController(CategoryRepository categoryRepository, CompanyRepository companyRepository, CompanyDescriptionRepository companyDescriptionRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.companyRepository = companyRepository;
        this.companyDescriptionRepository = companyDescriptionRepository;
        this.productRepository = productRepository;
    }

    @GetMapping("/product")
    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Optional<Product>> findById(@PathVariable Long id){
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()){
            return ResponseEntity.status(200).body(product);
        } else {
            return ResponseEntity.status(404).body(product);
        }
    }
}
