package vn.test.jpbbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import vn.test.jpbbackend.entity.ProductOfferingDetails;

public interface ProductOfferingDetailsRepo extends JpaRepository<ProductOfferingDetails, Long> {

    @Modifying
    @Query("DELETE FROM ProductOfferingDetails pod WHERE pod.ProductOfferings.id = :offeringsId")
    void deleteByProductOfferingsId(@Param("offeringsId") Long offeringsId);
}
