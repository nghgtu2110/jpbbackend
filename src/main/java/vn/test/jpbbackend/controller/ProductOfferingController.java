package vn.test.jpbbackend.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vn.test.jpbbackend.entity.ProductDetails;
import vn.test.jpbbackend.entity.ProductOfferings;
import vn.test.jpbbackend.service.ProductOfferingsService;

@RestController
@RequestMapping("/products")
public class ProductOfferingController {

    @Autowired
    private ProductOfferingsService productOfferingsService;

//    @GetMapping("/product")
//    public ResponseEntity<ProductOfferings> getRandomProduct() {
//        Random random = new Random();
//        int rid = random.nextInt(6000, 6501);
//        Long id = Long.valueOf(rid);
//        ProductOfferings productOfferings = productOfferingsService.getById(id);
//        return ResponseEntity.ok(productOfferings);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductOfferings> getById(@PathVariable Long id) {
        ProductOfferings productOfferings = productOfferingsService.getById(id);
        Logger.getLogger()
                .info("Preparing product details with ID: " + id);
        ProductDetails productDetails = productOfferings.getProductDetails();
        Logger.getLogger()
                .info("Retrieved product details with ID: " + productDetails.toString());
        return ResponseEntity.ok(productOfferings);
    }

//    @PostMapping("/products-name")
//    public ResponseEntity<List<ProductOfferings>> retrieveByName(@RequestParam @NonNull String name) {
//        List<ProductOfferings> productOfferings = productOfferingsService.retrieveByName(name);
//        return ResponseEntity.ok(productOfferings);
//    }

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

    @PostMapping("")
    public ResponseEntity<List<ProductOfferings>> retrieveByNameOrPrice(@RequestParam @NonNull String name, @RequestParam @Nullable Long price) {
        List<ProductOfferings> productOfferings = productOfferingsService.retrieveByNameOrPrice(name, price);
        return ResponseEntity.ok(productOfferings);
    }

    @PostMapping("add")
    public ResponseEntity<ProductOfferings> create(@RequestBody ProductOfferings productOfferings) {
        ProductOfferings createdProduct = productOfferingsService.createOneProduct(productOfferings);
        return ResponseEntity.ok(createdProduct);
    }

    @PostMapping("update")
    public ResponseEntity<ProductOfferings> update(@RequestBody @NonNull ProductOfferings requestProductOfferings) {
        ProductOfferings updatedProduct = productOfferingsService.updateOneProduct(requestProductOfferings);
        return ResponseEntity.ok(updatedProduct);
    }
}
