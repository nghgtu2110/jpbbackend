package vn.test.jpbbackend.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Table(name = "product_offering_details", catalog = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductOfferingDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NonNull
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "details_id")
    private Integer detailsId;

//     @ManyToOne()
//     @JoinColumn(name = "id", columnDefinition = "details_id", table = "product_details")
//     private ProductDetails details;

    @Column(name = "offerings_id")
    private Integer offeringsId;

//     @ManyToOne()
//     @JoinColumn(name = "id", columnDefinition = "offerings_id", table = "product_offerings")
//     private ProductOfferings offerings;

    @Column(name = "description")
    private String description;
}