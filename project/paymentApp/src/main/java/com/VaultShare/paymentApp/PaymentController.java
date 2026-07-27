package com.VaultShare.paymentApp;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")  // every endpoint in this class starts with /payments
public class PaymentController {
    @GetMapping // GET /payments  → returns the list
    public List<Payment> getAllPayments(){
        List<Payment> payments = new ArrayList<>();
        payments.add(new Payment(1L, "Acme Corp", new BigDecimal("500.00"), "PENDING"));
        payments.add(new Payment(2L, "Globex Inc", new BigDecimal("1250.00"), "APPROVED"));
        return payments;
    }
    @PostMapping  // POST /payments → accepts a payment, returns it back
    public Payment createPayment(@RequestBody Payment payment){
        payment.setStatus("PENDING"); // we set the status ourselves
        return payment;
    }

    
}
