package vn.test.jpbbackend.service;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import vn.test.jpbbackend.entity.ProductOfferings;

import java.util.List;

@Service
public interface ProductOfferingsService  {
    ProductOfferings getById(@NonNull Long id);
    List<ProductOfferings> getAll();
}
