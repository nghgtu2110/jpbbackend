package vn.test.jpbbackend.entity;

import java.io.Serializable;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Table(name = "product_details", catalog = "products")
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

    @Column(name = "weight", columnDefinition = "INT NOT LESS THAN 0", nullable = false)
    private Integer weight;

    @Column(name = "feature")
    private String feature;

    @Column(name = "power")
    private String power;

    @Column(name = "brand")
    private String brand;

    @Column(name = "image")
    private String image;

    @Column(name = "video")
    private String video;

//    @OneToOne(mappedBy = "productDetails")
//    private ProductOfferings productOfferings;

    @Override
    public String toString() {
        return "ProductDetails{" +
                "id=" + id +
                ", weight=" + weight +
                ", feature='" + feature + '\'' +
                ", power='" + power + '\'' +
                ", brand='" + brand + '\'' +
                ", image='" + image + '\'' +
                ", video='" + video + '\'' +
                '}';
    }
}