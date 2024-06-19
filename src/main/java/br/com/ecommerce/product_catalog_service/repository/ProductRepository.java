package br.com.ecommerce.product_catalog_service.repository;

import br.com.ecommerce.product_catalog_service.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByNameContainingAndPriceBetween(String name, BigDecimal minPrice, BigDecimal maxPrice, Pageable pageable);

}

