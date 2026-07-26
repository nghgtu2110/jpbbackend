package vn.test.jpbbackend.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Example;
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

    @Override
    public List<ProductOfferings> retrieveByName(@NonNull String name) {
        // if(id == null) {
        //     throw new RuntimeException("ID cannot be null");
        // }
        //        List<ProductOfferings> products = productOfferingsRepo.findAllByName(name);
        ProductOfferings product = new ProductOfferings();
        product.setName(name);
        Example<ProductOfferings> eName = Example.of(product);
        List<ProductOfferings> resProduct = productOfferingsRepo.findAll(eName);
        if(resProduct.isEmpty()){
            throw new RuntimeException("Khong tim thay san pham nao voi Name la:" + name);
        } else {
            return resProduct;
        }

    }

    @Override
    public List<ProductOfferings> retrieveByNameAndPrice(@NonNull String name, Long price) {
        ProductOfferings product = new ProductOfferings();
        product.setName(name);
        if (price != null) {
            product.setPrice(price);
        }

        Example<ProductOfferings> eProduct = Example.of(product);
        List<ProductOfferings> resProduct = productOfferingsRepo.findAll(eProduct);
        if(resProduct.isEmpty()){
            throw new RuntimeException("Khong tim thay san pham nao voi Name la: " + name + " va Price la: " + price);
        } else {
            return resProduct;
        }
    }

    @Override
    public List<ProductOfferings> getByNameAndPrice(@NonNull String name, @NonNull Long price) {
        ProductOfferings productOfferings = new ProductOfferings();
        productOfferings.setName(name);
        productOfferings.setPrice(price);
        return productOfferingsRepo.findAll();
    }

    @Override
    public List<ProductOfferings> getByName(String name) {
        ProductOfferings productOfferings = new ProductOfferings();
        productOfferings.setName(name);
        return productOfferingsRepo.findAll();
    }
}
