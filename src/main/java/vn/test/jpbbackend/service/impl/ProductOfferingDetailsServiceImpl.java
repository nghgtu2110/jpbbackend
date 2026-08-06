package vn.test.jpbbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import vn.test.jpbbackend.entity.ProductOfferingDetails;
import vn.test.jpbbackend.entity.ProductOfferings;
import vn.test.jpbbackend.service.ProductOfferingDetailsService;

import java.util.Optional;

@Service
public class ProductOfferingDetailsServiceImpl implements ProductOfferingDetailsService {

    @Autowired
    private ProductOfferingDetails productOfferingDetails;

    @Override
    public ProductOfferingDetails getById(@NonNull Long id) {
        // if(id == null) {
        //     throw new RuntimeException("ID cannot be null");
        // }
        Optional<ProductOfferings> product = productOfferingDetails.findById(id);
        if(product.isEmpty()){
            throw new RuntimeException("Khong tim thay product");
        } else {
            return product.get();
        }
    }
}
