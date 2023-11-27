package vn.edu.iuh.fit.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.backend.enums.ProductStatus;
import vn.edu.iuh.fit.backend.models.Product;

import java.util.List;

@Repository

public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product> findProductByStatus(ProductStatus status);
}
