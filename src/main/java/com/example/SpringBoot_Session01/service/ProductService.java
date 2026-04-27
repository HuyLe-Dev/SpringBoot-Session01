package com.example.SpringBoot_Session01.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringBoot_Session01.model.Product;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    // Constructor: Tạo dữ liệu giả khi khởi động
    public ProductService() {
        products.add(new Product(1, "Laptop Dell", 1500.0));
        products.add(new Product(2, "iPhone 15", 1200.0));
        products.add(new Product(3, "Chuột Logitech", 25.0));
    }

    // 1. Lấy tất cả danh sách
    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    public Product updateProduct(int id, Product newInfo) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(newInfo.getName());
                product.setPrice(newInfo.getPrice());
                return product;
            }
        }
        return null;
    }

    public boolean deleteProduct(int id) {
        // removeIf trả về true nếu xóa được phần tử
        return products.removeIf(p -> p.getId() == id);
    }
}
