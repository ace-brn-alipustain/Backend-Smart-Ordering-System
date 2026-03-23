package com.ace_brn_alipustain.Smart_Ordering_System.AdminModule.Controller;

import com.ace_brn_alipustain.Smart_Ordering_System.AdminModule.DTOS.CashierDTO;
import com.ace_brn_alipustain.Smart_Ordering_System.AdminModule.Service.AdminService;
import com.ace_brn_alipustain.Smart_Ordering_System.AdminModule.DTOS.AdminDTO;
import com.ace_brn_alipustain.Smart_Ordering_System.User.UserModel;
import lombok.AllArgsConstructor;
import org.apache.catalina.valves.rewrite.ResolverImpl;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@AllArgsConstructor
public class AdminController {


    private final AdminService adminService;

    @PostMapping("/create-admin-account")
    public ResponseEntity<?> createAdmin(@RequestBody AdminDTO dto){
        try{
            String response= adminService.createAdmin(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }catch(RuntimeException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @PostMapping("/create-cashier-account")
    public ResponseEntity<?> createCashier(@RequestBody CashierDTO dto){
        try{
            String response= adminService.createCashierAccount(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }catch(RuntimeException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
    @GetMapping("/user/{id}/employee")
    public ResponseEntity<?> getCashier(@PathVariable String id){
        try{
            UserModel response= adminService.getCashier(id);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }catch(RuntimeException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

}
