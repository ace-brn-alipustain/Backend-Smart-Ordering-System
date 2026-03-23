package com.ace_brn_alipustain.Smart_Ordering_System.AdminModule.DTOS;

import com.sun.jdi.PrimitiveValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CashierDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
