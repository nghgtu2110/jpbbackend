package vn.test.jpbbackend.repository;

import org.springframework.stereotype.Repository;
import vn.test.jpbbackend.entity.ProductOfferings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface ProductOfferingsRepo extends JpaRepository<ProductOfferings, Long> {
//    public List<ProductOfferings> findAllByName(String name);
}
