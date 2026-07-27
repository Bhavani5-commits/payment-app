package com.VaultShare.paymentApp;

import java.math.BigDecimal;

public class Payment {
   private long id;
   private String vendor;
   private BigDecimal amount;
   private String status;

 //Empty constructor — Spring/Jackson needs this to build objects from incoming JSON
   public Payment(){}
   public Payment(long id,String vendor,BigDecimal amount,String status){
    this.id=id;
    this.vendor=vendor;
    this.amount=amount;
    this.status=status;
   }
   public long getId(){
    return id;
    }
    public void setId(long id){
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
