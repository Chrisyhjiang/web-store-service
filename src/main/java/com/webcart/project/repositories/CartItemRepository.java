package com.webcart.project.repositories;

import com.webcart.project.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
