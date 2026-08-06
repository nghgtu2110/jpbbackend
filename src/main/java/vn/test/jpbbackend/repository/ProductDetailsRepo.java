package vn.test.jpbbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.test.jpbbackend.entity.ProductDetails;

public interface ProductDetailsRepo extends JpaRepository<ProductDetails, Long> {
}
