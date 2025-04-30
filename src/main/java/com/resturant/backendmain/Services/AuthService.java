package com.resturant.backendmain.Services;

import com.resturant.backendmain.Repository.CustomerRepository;
import com.resturant.backendmain.dto.CustomerResponse;
import com.resturant.backendmain.dto.LoginRequest;
import com.resturant.backendmain.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
//    registerUser()
    private final CustomerRepository customerRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public AuthService(CustomerRepository customerRepository, BCryptPasswordEncoder passwordEncoder) {
        this.customerRepository = customerRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public CustomerResponse loginCUstomer( LoginRequest request){
        Optional<Customer> customer = customerRepository.findByEmail(request.getEmail());
      if(customer.isPresent()){
          throw new RuntimeException("User not found");
      }
      Customer customer1 = customer.get();
      if(!passwordEncoder.matches(customer1.getPasswordHash(), request.getPassword())){
          throw new RuntimeException("Wrong password");
      }
      return new CustomerResponse(
        customer1.getFirstName(),
        customer1.getSecondName(),
        customer1.getEmail(),
        customer1.getPasswordHash()
      );

    }
}
