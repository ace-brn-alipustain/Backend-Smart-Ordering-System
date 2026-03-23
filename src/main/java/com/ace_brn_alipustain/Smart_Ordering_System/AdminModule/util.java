package com.ace_brn_alipustain.Smart_Ordering_System.AdminModule;

import com.ace_brn_alipustain.Smart_Ordering_System.AdminModule.DTOS.AdminDTO;
import com.ace_brn_alipustain.Smart_Ordering_System.Enumeration.Role;
import com.ace_brn_alipustain.Smart_Ordering_System.User.UserModel;
import com.ace_brn_alipustain.Smart_Ordering_System.User.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class util {


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
}
