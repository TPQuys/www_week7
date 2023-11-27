package vn.edu.iuh.fit.frontend.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backend.models.Product;
import vn.edu.iuh.fit.backend.services.ProductService;

import java.util.List;

@Component
public class ProductModel {
    @Autowired
    private ProductService productService;

    public List<Product> findProductActive(){
        return productService.findProductActive();
    }
}
