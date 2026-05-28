package com.example.inventory.repository;

import com.example.inventory.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Product> findAll() {
        String sql = """
                select
                    id,
                    product_code,
                    name,
                    category,
                    maker,
                    unit,
                    is_active,
                    created_at,
                    updated_at
                from products
                order by id
                """;

        return jdbcTemplate.query(sql, (rs, rowNum) -> new Product(
                rs.getLong("id"),
                rs.getString("product_code"),
                rs.getString("name"),
                rs.getString("category"),
                rs.getString("maker"),
                rs.getString("unit"),
                rs.getBoolean("is_active"),
                rs.getObject("created_at", java.time.OffsetDateTime.class),
                rs.getObject("updated_at", java.time.OffsetDateTime.class)
        ));
    }
}