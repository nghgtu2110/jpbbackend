package vn.test.jpbbackend.service.impl;

import org.springframework.stereotype.Service;
import vn.test.jpbbackend.entity.ProductOfferings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import vn.test.jpbbackend.repository.ProductOfferingsRepo;
import vn.test.jpbbackend.service.ProductOfferingsService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProductOfferingsServiceImpl implements ProductOfferingsService {

    @Autowired
    private ProductOfferingsRepo productOfferingsRepo;

    @Override
    public ProductOfferings getById(@NonNull Long id) {
        // if(id == null) {
        //     throw new RuntimeException("ID cannot be null");
        // }
        Optional<ProductOfferings> product = productOfferingsRepo.findById(id);
        if(product.isEmpty()){
            throw new RuntimeException("Khong tim thay product");
        } else {
            return product.get();
        }
    }

    @Override
    public List<ProductOfferings> getAll() {
        List<ProductOfferings> products = productOfferingsRepo.findAll();
        if(products.isEmpty()){
//            return new ArrayList<>();
            return Collections.emptyList();
        } else {
            return products;
        }
    }
}
