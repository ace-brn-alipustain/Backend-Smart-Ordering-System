package com.ace_brn_alipustain.Smart_Ordering_System.OrderModule.Repository;

import com.ace_brn_alipustain.Smart_Ordering_System.OrderModule.Model.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductItemRepository extends JpaRepository<ProductItem,Long > {

    List<ProductItem> findByType (Long id);
}
