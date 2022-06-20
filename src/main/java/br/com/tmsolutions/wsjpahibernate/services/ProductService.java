package br.com.tmsolutions.wsjpahibernate.services;

import br.com.tmsolutions.wsjpahibernate.dto.ProductDto;
import br.com.tmsolutions.wsjpahibernate.entities.ProductEntity;
import br.com.tmsolutions.wsjpahibernate.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public void save(ProductDto productDto){
        ProductEntity productEntity = new ProductEntity(productDto.getName(), productDto.getPrice(),
                productDto.getDescription());

        this.productRepository.save(productEntity);
    }


    public ProductEntity get(Long id) {
        Optional<ProductEntity> productRepositoryById = this.productRepository.findById(id);
        if(productRepositoryById.isPresent()){
            return productRepositoryById.get();
        }
        return null;
    }
}
