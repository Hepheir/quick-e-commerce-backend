package com.example.demo.microservice.search.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductListDTO {
    private List<ProductDTO> products;
    private Integer page;
}
