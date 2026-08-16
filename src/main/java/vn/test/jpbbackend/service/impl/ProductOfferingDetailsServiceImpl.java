package vn.test.jpbbackend.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import io.micrometer.common.lang.NonNull;
import vn.test.jpbbackend.entity.ProductDetails;
import vn.test.jpbbackend.entity.ProductOfferingDetails;
import vn.test.jpbbackend.repository.ProductOfferingDetailsRepo;
import vn.test.jpbbackend.service.ProductOfferingDetailsService;

@Service
public class ProductOfferingDetailsServiceImpl implements ProductOfferingDetailsService {

    @Autowired
    private ProductOfferingDetailsRepo productOfferingDetailsRepo;

    @Override
    public ProductOfferingDetails getById(Long id) {
        // if(id == null) {
        //     throw new RuntimeException("ID cannot be null");
        // }
        Optional<ProductOfferingDetails> product = productOfferingDetailsRepo.findById(id);
        if(product.isEmpty()){
            throw new RuntimeException("Khong tim thay product");
        } else {
            return product.get();
        }
    }

//     @Override
//     public List<ProductOfferingDetails> getListByDetailsId(@NonNull Long id) {
//         ProductDetails detail = new ProductDetails();
//         detail.setId(id);
//
//         ProductOfferingDetails product = new ProductOfferingDetails();
//         product.setDetails(detail);
//
//         Example<ProductOfferingDetails> example = Example.of(product);
//         List<ProductOfferingDetails> list = productOfferingDetailsRepo.findAll(example);
//         if(list.isEmpty()){
//             return Collections.emptyList();
//         }
//         return list;
//     }
}
