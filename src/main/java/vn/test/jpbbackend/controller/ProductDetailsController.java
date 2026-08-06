package vn.test.jpbbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.test.jpbbackend.entity.ProductDetails;
import vn.test.jpbbackend.service.ProductDetailsService;

import java.util.List;

@RestController
@RequestMapping("/product-details")
public class ProductDetailsController {
    @Autowired
    private ProductDetailsService productDetailsService;

    @GetMapping("/list")
    public ResponseEntity<List<ProductDetails>> getAll() {
        List<ProductDetails> listProductDetail = productDetailsService.getAll();
        return ResponseEntity.ok(listProductDetail);
    }
    
}