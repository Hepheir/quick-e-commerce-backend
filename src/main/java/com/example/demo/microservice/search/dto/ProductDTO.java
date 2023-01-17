package com.example.demo.microservice.search.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductDTO {
    private String thumbnailImageUrl;
    private String informationUrl;
    private String brand;
    private String name;
    private Double originalPrice;
    private String discountedPrice;
    private Double discountRate;
    private Boolean isOnSale;
    private String saleStart;
    private String saleEnd;
    private Boolean isSoldOut;
}
