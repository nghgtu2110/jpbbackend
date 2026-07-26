package vn.test.jpbbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.generator.internal.CurrentTimestampGeneration;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "product_offerings", catalog = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductOfferings implements Serializable {
    @Id
    @NonNull
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price", columnDefinition = "INT NOT NULL", nullable = false)
    @ColumnDefault("1000")
    private Long price;

    @Column(name = "color")
    @ColumnDefault("blue")
    private String color;

//    @Column(name = "created_at")
//    @Temporal(TemporalType.TIMESTAMP)
//    @CreationTimestamp
//    private Date createdAt;
//
//    @Column(name = "last_updated")
//    @Temporal(TemporalType.TIMESTAMP)
//    @UpdateTimestamp
//    private Date lastUpdated;
//
//    @PrePersist
//    public void prePersist() {
//        if (createdAt == null) {
//            createdAt = new Date();
//        }
//    }
//
//    @PostUpdate
//    public void postUpdate() {
//        if (lastUpdated == null) {
//            lastUpdated = new Date();
//        }
//    }

}
