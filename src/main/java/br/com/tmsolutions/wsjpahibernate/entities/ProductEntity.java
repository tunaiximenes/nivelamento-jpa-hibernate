package br.com.tmsolutions.wsjpahibernate.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity(name = "tb_product")
@Table(name = "tb_product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Long price;

    @Column(name = "description")
    private String description;

    public ProductEntity() {
    }

    public ProductEntity(String name, Long price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
