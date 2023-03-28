package com.example.api.controller;
import com.example.api.model.Product;
import com.example.api.model.ProductID;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping
    public String hello() {
        return "Hello World!";
    }
    @PostMapping
    public ResponseEntity<ProductID> createProduct(@RequestBody final Product product) {
        ProductID result = new ProductID(UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(result);
    }
}