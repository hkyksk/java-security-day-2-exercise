package com.booleanuk.api.repository;

import com.booleanuk.api.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ItemRepository extends JpaRepository<Item, Integer> {
}