package com.ace_brn_alipustain.Smart_Ordering_System.OrderModule.Model;

import com.ace_brn_alipustain.Smart_Ordering_System.OrderModule.Enum.Status;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data

public class Order {

    private Long id;

    private String oderId;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Double totalAmount;

    private String paidBy;

    private String referenceID;



}
