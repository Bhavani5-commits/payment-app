package com.VaultShare.paymentApp;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")  // every endpoint in this class starts with /payments
public class PaymentController {
    private final PaymentService paymentService;
    public PaymentController(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    @GetMapping // GET /payments  → returns the list
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }
    @PostMapping  // POST /payments → accepts a payment, returns it back
    public Payment createPayment(@RequestBody Payment payment){
        return paymentService.createPayment(payment);
    }
}
