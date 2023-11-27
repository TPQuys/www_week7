package vn.edu.iuh.fit.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import vn.edu.iuh.fit.backend.models.Product;
import vn.edu.iuh.fit.frontend.models.ProductModel;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ProductModel productModel;
    @GetMapping("")
    public String homePage(Model model){
        List<Product> products = productModel.findProductActive();
        model.addAttribute("products", products);
        return "home";
    }
}
