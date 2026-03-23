package com.ace_brn_alipustain.Smart_Ordering_System.AdminModule.Service;

import com.ace_brn_alipustain.Smart_Ordering_System.AdminModule.DTOS.AdminDTO;
import com.ace_brn_alipustain.Smart_Ordering_System.AdminModule.DTOS.CashierDTO;
import com.ace_brn_alipustain.Smart_Ordering_System.Enumeration.Role;
import com.ace_brn_alipustain.Smart_Ordering_System.User.UserModel;
import com.ace_brn_alipustain.Smart_Ordering_System.User.UserRepository;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor

public class AdminService {


    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;


    public String createAdmin (AdminDTO dto){
        if(userRepository.existsByEmail(dto.getEmail()))
            throw new RuntimeException("Email Already Exist! ");
        UserModel user= UserModel.builder()
                .firstName(dto.getFirstName())
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword()))
                .lastName(dto.getLastName())
                .role(Role.Admin)
                .build();

        userRepository.save(user);
        return "User created Successfully";
    }

    @Transactional
    public String createCashierAccount(CashierDTO dto){
        if(userRepository.existsByEmail(dto.getEmail()))
            throw new RuntimeException("Email already exist! ");

        UserModel user = UserModel.builder()
                .employeeId(null)
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .password(passwordEncoder.encode(dto.getPassword()))
                .email(dto.getEmail())
                .role(Role.Cashier)
                .build();
        userRepository.save(user);
        updateEmployeeId(dto.getEmail());
        return "Successfully created";
    }
    private String updateEmployeeId(String email){
        UserModel user=userRepository.findByEmail(email);
        String employeeId="CASHIER"+user.getId();
        user.setEmployeeId(employeeId);
        userRepository.save(user);
       return "Successfully updated";
    }
    public UserModel getCashier(String id) {
        UserModel user = userRepository.findByEmployeeId(id);
        if (user == null) {
            throw new RuntimeException("User not found");
        }
        return user;
    }
}
