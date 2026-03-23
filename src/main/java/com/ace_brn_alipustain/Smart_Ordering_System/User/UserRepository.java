package com.ace_brn_alipustain.Smart_Ordering_System.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {

    Optional<UserModel> findById(Long Id);
    boolean existsByEmail(String email);
    UserModel findByEmail(String emial);
    UserModel findByEmployeeId(String id);

}
