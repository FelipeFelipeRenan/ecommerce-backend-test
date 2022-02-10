package com.br.felipe.ecommerce.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.felipe.ecommerce.models.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
