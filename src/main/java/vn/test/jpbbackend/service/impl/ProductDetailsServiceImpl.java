package vn.test.jpbbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.test.jpbbackend.entity.ProductDetails;
import vn.test.jpbbackend.repository.ProductDetailsRepo;
import vn.test.jpbbackend.service.ProductDetailsService;

import java.util.Collections;
import java.util.List;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {

    @Autowired
    private ProductDetailsRepo productDetailsRepo;

    @Override
    public List<ProductDetails> getAll() {
        List<ProductDetails> detailsList = productDetailsRepo.findAll();
        if(detailsList.isEmpty()){
//            return new ArrayList<>();
            return Collections.emptyList();
        } else {
            return detailsList;
        }
    }

}
