package com.ace_brn_alipustain.Smart_Ordering_System.User;

import com.ace_brn_alipustain.Smart_Ordering_System.Enumeration.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employeeID")
    private String employeeId;

    @Column(name = "email",unique = true)
    private String email;

    @Column(name="password")
    private String password;
    @Column(name = "firstName")
    private String firstName;

    @Column(name = "mname")
    private String mName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column(name="isEnabled")
    private boolean isEnabled;

    @Column(name = "role")
    @Enumerated (EnumType.STRING)
    private Role role;


}
