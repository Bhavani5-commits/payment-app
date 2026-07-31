package com.VaultShare.paymentApp;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;
    // Spring gives us the repository automatically (dependency injection)
    public PaymentService(PaymentRepository paymentRepository)
    {
        this.paymentRepository=paymentRepository;
    }
    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();// reads all rows from the DB
    }
    public Payment createPayment(Payment payment){
        payment.setStatus("PENDING");// business rule: new payments start PENDING
        payment.setId(null);// let the DB generate the id
        return paymentRepository.save(payment);// saves to the DB, returns the saved row (with its new id)
    }
    
}
