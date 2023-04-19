package com.cs304project.MotorTraffic.controller;

import com.cs304project.MotorTraffic.model.Fine;
import com.cs304project.MotorTraffic.model.Payment;
import com.cs304project.MotorTraffic.service.FineService;
import com.cs304project.MotorTraffic.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/api/v2/open")
@CrossOrigin
public class PaymentController {


    @Autowired
    private PaymentService paymentService;

    @PostMapping("/addpayment")
    public String add(@RequestBody Payment payment) {
        paymentService.savePayment(payment);
        return "new payment added";
    }
}
