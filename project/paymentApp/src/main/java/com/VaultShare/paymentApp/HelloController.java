package com.VaultShare.paymentApp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello()
    {
        return "VaultShare is Alive!!";
    }
    
}
