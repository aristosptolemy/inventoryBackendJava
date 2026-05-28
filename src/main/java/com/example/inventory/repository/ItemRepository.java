package com.example.inventory.repository;

import com.example.inventory.model.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

// 本番では JpaRepository を使う
// import org.springframework.data.jpa.repository.JpaRepository;

// public interface ItemRepository extends JpaRepository<Item, Long> {}

@Repository
public class ItemRepository {

    // 仮データを返す（DB なし）
    public List<Item> findAll() {
        return List.of(
                new Item(1L, "Keyboard", 10),
                new Item(2L, "Mouse", 5),
                new Item(3L, "Monitor", 2)
        );
    }




}
