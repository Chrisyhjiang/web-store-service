package com.webcart.project.service;

import com.webcart.project.payload.CartDTO;

public interface CartService {
    CartDTO addProductToCart(Long productId, Integer quantity);
}
