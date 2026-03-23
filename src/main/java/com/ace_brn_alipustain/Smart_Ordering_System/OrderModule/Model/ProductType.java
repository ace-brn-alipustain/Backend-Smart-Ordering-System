package com.ace_brn_alipustain.Smart_Ordering_System.OrderModule.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Table(name = "ProductType")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "productType")
    private String productType;

    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductItem> productItemList = new ArrayList<>();
}
