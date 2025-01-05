package com.webcart.project.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProductDTO {
    private Long ProductId;
    private String productName;
    private String description;
    private String image;
    private Integer quantity;

    private double price;
    private double specialPrice;
    private double discount;


}
