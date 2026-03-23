package com.ace_brn_alipustain.Smart_Ordering_System.AdminModule.DTOS;

import com.ace_brn_alipustain.Smart_Ordering_System.Enumeration.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDTO {

    private String firstName;
    private String lastName;
    private String password;
    private String email;

}
