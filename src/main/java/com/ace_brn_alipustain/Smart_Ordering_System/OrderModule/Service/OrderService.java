package com.ace_brn_alipustain.Smart_Ordering_System.OrderModule.Service;

import com.ace_brn_alipustain.Smart_Ordering_System.OrderModule.Model.ProductItem;
import com.ace_brn_alipustain.Smart_Ordering_System.OrderModule.Model.ProductType;
import com.ace_brn_alipustain.Smart_Ordering_System.OrderModule.Repository.ProductTypeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class OrderService {

    private final ProductTypeRepository productTypeRepository;


    public String createProductType (ProductType type){

        ProductType productType = ProductType.builder()
                .productType(type.getProductType())
                .build();
        productTypeRepository.save(productType);
        return "Product Successfully Created";
    }

}
