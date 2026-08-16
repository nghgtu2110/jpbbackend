package vn.test.jpbbackend.service;

import java.util.List;

import java.lang.Long;

import io.micrometer.common.lang.NonNull;
import vn.test.jpbbackend.entity.ProductOfferingDetails;

public interface ProductOfferingDetailsService {
    ProductOfferingDetails getById(Long id);

//     List<ProductOfferingDetails> getListByDetailsId(@NonNull Long id);
}
