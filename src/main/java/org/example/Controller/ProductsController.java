package org.example.Controller;

import org.example.model.Products;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public String listproducts(Model model){
        model.addAttribute("products", service.getAllProducts());
        return "products";
    }
}
