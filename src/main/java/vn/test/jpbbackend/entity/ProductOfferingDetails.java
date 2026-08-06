package vn.test.jpbbackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

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

    @ManyToOne()
    @JoinColumn(name = "id", columnDefinition = "details_id", table = "product_details")
    private Long productDetailsId;

    @OneToOne(mappedBy = "productOfferings")
    private Long productOfferingsId;

//    @Override
//    public String toString() {
//        return "ProductDetails{" +
//                "id=" + id +
//                ", weight=" + weight +
//                ", feature='" + feature + '\'' +
//                ", power='" + power + '\'' +
//                ", brand='" + brand + '\'' +
//                ", image='" + image + '\'' +
//                ", video='" + video + '\'' +
//                '}';
//    }
}