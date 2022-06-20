package br.com.tmsolutions.wsjpahibernate.repositories;

import br.com.tmsolutions.wsjpahibernate.entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
}
