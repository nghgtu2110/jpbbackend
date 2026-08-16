package vn.test.jpbbackend.service;

import java.util.List;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import vn.test.jpbbackend.dto.request.ProductOfferingCreateRequest;
import vn.test.jpbbackend.entity.ProductOfferings;

@Service
public interface ProductOfferingsService  {
    ProductOfferings getById(@NonNull Long id);
    List<ProductOfferings> getAll();
    List<ProductOfferings> retrieveByName(@NonNull String name);

    List<ProductOfferings> retrieveByNameOrPrice(@NonNull String name, Long price);

    List<ProductOfferings> getByNameAndPrice(@NonNull String name, @NonNull Long price);

    List<ProductOfferings> getByName(String name);

    ProductOfferings createOneProduct(ProductOfferings productOfferings);

    ProductOfferings updateOneProduct(ProductOfferings productOfferings);

    List<ProductOfferings> findAllByName(String name);

    List<ProductOfferings> findByDetailId(Integer detailId);

    ProductOfferings createOne(ProductOfferingCreateRequest request);
}
