package vn.test.jpbbackend.controller;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;
import vn.test.jpbbackend.entity.ProductOfferings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

//    @PostMapping("/products-name")
//    public ResponseEntity<List<ProductOfferings>> retrieveByName(@RequestParam @NonNull String name) {
//        List<ProductOfferings> productOfferings = productOfferingsService.retrieveByName(name);
//        return ResponseEntity.ok(productOfferings);
//    }

    @PostMapping("/products")
    public ResponseEntity<List<ProductOfferings>> retrieveByNameAndPrice(@RequestParam @NonNull String name, @RequestParam @Nullable Long price) {
        List<ProductOfferings> productOfferings = productOfferingsService.retrieveByNameAndPrice(name, price);
        return ResponseEntity.ok(productOfferings);
    }

    @GetMapping("/get-name")
    public ResponseEntity<List<ProductOfferings>> getByName (@NonNull String name) {
        name = "Product 6001";

        List<ProductOfferings> listProductOfferings =
                productOfferingsService.getByName(name);

        return ResponseEntity.ok(listProductOfferings);
    }

    @GetMapping("/get-name-and-price")
    public ResponseEntity<List<ProductOfferings>> getByNameAndPrice (@NonNull String name, @NonNull Long price) {
        name = "Product 6001";
        price = 1000L;

        List<ProductOfferings> listProductOfferings =
                productOfferingsService.getByNameAndPrice(name, price);

        return ResponseEntity.ok(listProductOfferings);
    }

//    @GetMapping("/products")
//    public ResponseEntity<List<ProductOfferings>> getAllProducts() {
//        List<ProductOfferings> productOfferings = productOfferingsService.getAll();
//        return ResponseEntity.ok(productOfferings);
//    }
}
