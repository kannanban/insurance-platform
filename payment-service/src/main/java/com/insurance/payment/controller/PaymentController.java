package com.insurance.payment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @PostMapping("/direct")
    public String issueDirectPayment() {
        return "Direct payment processed";
    }

    @PostMapping("/autopay")
    public String autoPay() {
        return "AutoPay processed";
    }

    @PostMapping("/lockbox")
    public String lockboxPayment() {
        return "Lockbox payment process completed";
    }

    @PostMapping("/refund")
    public String refundPayment() {
        return "Refund process completed";
    }
}
