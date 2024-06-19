package br.com.ecommerce.product_catalog_service.model;

import jakarta.persistence.*;
import lombok.Data; // Importar a anotação @Data
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Data // Adicionar a anotação @Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(length = 500)
    private String description;

    @Column(nullable = false)
    private BigDecimal price;
}
