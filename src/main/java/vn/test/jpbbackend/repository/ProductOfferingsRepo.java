package vn.test.jpbbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import vn.test.jpbbackend.entity.ProductOfferings;


public interface ProductOfferingsRepo extends JpaRepository<ProductOfferings, Long> {

    @Query("SELECT po FROM ProductOfferings po WHERE po.name = :name")
    public List<ProductOfferings> findAllByName(@Param("name") String name);

    // nativeQuery = true
    @Query("""
        SELECT po
        FROM ProductOfferings po
        JOIN ProductOfferingDetails pod
            ON po.id = pod.offeringsId
        WHERE pod.detailsId = :detail_id
    """)
    public List<ProductOfferings> findByDetailId(@Param("detail_id") Integer detailId);
}
