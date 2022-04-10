package com.ibercode.paymentService;

class PaymentException extends RuntimeException{

    public PaymentException(){
        super();
    }

    public PaymentException(String order){
        super(order);
    }
}