package com.ace_brn_alipustain.Smart_Ordering_System.OrderModule.Repository;

import com.ace_brn_alipustain.Smart_Ordering_System.OrderModule.Model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductTypeRepository extends JpaRepository<ProductType, Long > {


}
