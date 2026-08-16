package vn.test.jpbbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.test.jpbbackend.entity.ProductOfferingDetails;
import vn.test.jpbbackend.service.ProductOfferingDetailsService;

@RestController
@RequestMapping("product-offering-details")
public class ProductOfferingDetailsController {

    @Autowired
    private ProductOfferingDetailsService productOfferingDetailsService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductOfferingDetails> getById(@PathVariable Long id) {
        ProductOfferingDetails productOfferingDetails = productOfferingDetailsService.getById(id);
        
        return ResponseEntity.ok(productOfferingDetails);
    }

        //  @GetMapping("/details/{id}")
        //  public ResponseEntity<List<ProductOfferingDetails>> getListByDetailsId(@PathVariable Long id) {
        //      List<ProductOfferingDetails> list = productOfferingDetailsService.getListByDetailsId(id);
        //      return ResponseEntity.ok(list);
        //  }
}
