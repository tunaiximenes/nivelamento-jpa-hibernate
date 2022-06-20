package br.com.tmsolutions.wsjpahibernate.controller;

import br.com.tmsolutions.wsjpahibernate.dto.ProductDto;
import br.com.tmsolutions.wsjpahibernate.entities.ProductEntity;
import br.com.tmsolutions.wsjpahibernate.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(value="/save")
    public void save(@RequestBody ProductDto productDto){
        this.productService.save(productDto);
    }

    @GetMapping(value = "/get/{id}")
    public ProductEntity get(@PathVariable("id") Long id){
        return this.productService.get(id);
    }
}
