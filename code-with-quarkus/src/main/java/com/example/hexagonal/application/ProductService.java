package com.example.hexagonal.application;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductService {
    public String getAllProducts() {
        // Implementación de obtención de productos
        return "Listado de productos";
    }
}