package com.example.demo.microservice.search.controller;

import com.example.demo.NotImplementedError;
import com.example.demo.microservice.search.dto.ProductListDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class SearchController {
    @GetMapping("/search/category/{categoryId}")
    public ResponseEntity<ProductListDTO> searchAllByCategory(
            @PathVariable Integer categoryId
    ) {
        // TODO: Implement
        throw new NotImplementedError();
    }
}
