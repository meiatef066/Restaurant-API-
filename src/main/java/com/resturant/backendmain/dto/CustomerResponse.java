package com.resturant.backendmain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerResponse {
    @NotBlank
    private String firstName;
    private String lastName;
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String password;

    public CustomerResponse(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

}
