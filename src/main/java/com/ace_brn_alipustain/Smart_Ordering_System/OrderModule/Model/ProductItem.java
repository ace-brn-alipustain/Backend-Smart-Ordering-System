package com.ace_brn_alipustain.Smart_Ordering_System.OrderModule.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "product_Items")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "productName")
    private String productName;

    @Column(name = "productPrice")
    private Double productPrice;

    @ManyToOne()
    @JoinColumn(name = "product_Id")
    private ProductType type;
}
