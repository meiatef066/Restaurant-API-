package com.resturant.backendmain.Controller;

import com.resturant.backendmain.Services.AuthService;
import com.resturant.backendmain.dto.CustomerResponse;
import com.resturant.backendmain.dto.LoginRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
///api/auth/register, /api/auth/login, /api/auth/verify
@RestController("api/vi/customer")
public class AuthController {

    private final AuthService authService;
    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // 1. user register
    @PostMapping("/register")
    public int Register(@RequestBody @Valid CustomerResponse register) {
        return 1;
    }
    @PostMapping("/login")
    public ResponseEntity<CustomerResponse> login( @RequestBody @Valid LoginRequest loginRequest ) {
        CustomerResponse response=authService.loginCUstomer(loginRequest);
        return ResponseEntity.ok(response);
    }




}
