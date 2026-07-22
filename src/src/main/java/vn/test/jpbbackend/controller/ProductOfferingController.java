package vn.test.jpbbackend.controller;

import org.springframework.web.bind.annotation.PathVariable;
import vn.test.jpbbackend.entity.ProductOfferings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.test.jpbbackend.service.ProductOfferingsService;

import java.util.List;
import java.util.Random;

@RestController
public class ProductOfferingController {

    @Autowired
    private ProductOfferingsService productOfferingsService;

    @GetMapping("/product")
    public ResponseEntity<ProductOfferings> getRandomProduct() {
        Random random = new Random();
        int rid = random.nextInt(6000, 6501);
        Long id = Long.valueOf(rid);
        ProductOfferings productOfferings = productOfferingsService.getById(id);
        return ResponseEntity.ok(productOfferings);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<ProductOfferings> getById(@PathVariable Long id) {
        ProductOfferings productOfferings = productOfferingsService.getById(id);
        return ResponseEntity.ok(productOfferings);
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductOfferings>> getAllProducts() {
        List<ProductOfferings> productOfferings = productOfferingsService.getAll();
        return ResponseEntity.ok(productOfferings);
    }
}
