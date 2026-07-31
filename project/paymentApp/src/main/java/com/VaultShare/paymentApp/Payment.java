package com.VaultShare.paymentApp;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String vendor;
   private BigDecimal amount;
   private String status;

 //Empty constructor — Spring/Jackson needs this to build objects from incoming JSON
   public Payment(){}
   public Payment(Long id,String vendor,BigDecimal amount,String status){
    this.id=id;
    this.vendor=vendor;
    this.amount=amount;
    this.status=status;
   }
   public Long getId(){
    return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getVendor(){
        return vendor; 
    }
    public void setVendor(String vendor){
        this.vendor=vendor;
    }
    public BigDecimal getAmount(){
        return amount;
    }
    public void setAmount(BigDecimal amount){
        this.amount=amount;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status=status;
    }


}
