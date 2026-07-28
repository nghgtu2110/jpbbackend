package vn.test.jpbbackend.entity;

import java.io.Serializable;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import vn.test.jpbbackend.model.Status;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price", columnDefinition = "INT NOT NULL", nullable = false)
    @ColumnDefault("1000")
    private Long price;

    @Column(name = "color")
    @ColumnDefault("blue")
    private String color;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

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
