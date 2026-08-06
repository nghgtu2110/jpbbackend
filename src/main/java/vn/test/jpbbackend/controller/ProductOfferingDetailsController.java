package vn.test.jpbbackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.test.jpbbackend.entity.ProductDetails;
import vn.test.jpbbackend.entity.ProductOfferings;

import java.util.logging.Logger;

@RestController
@RequestMapping("product-offering-details")
public class ProductOfferingDetailsController {
    @GetMapping("/{id}")
    public ResponseEntity<ProductOfferingDetails> getById(@PathVariable Long id) {
        ProductOfferings productOfferings = productOfferingsService.getById(id);
        Logger.getLogger("")
                .info("Preparing product details with ID: " + id);
        ProductDetails productDetails = productOfferings.getProductDetails();
        Logger.getLogger("")
                .info("Retrieved product details with ID: " + productDetails.toString());
        return ResponseEntity.ok(productOfferings);
    }
}
