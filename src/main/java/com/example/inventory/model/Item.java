package com.example.inventory.model;

// import jakarta.persistence.*; // ← DB を使うときに有効化

// @Entity  // ← DB を使うときに有効化
public class Item {

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int stock;

    public Item(Long id, String name, int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public int getStock() { return stock; }
}
