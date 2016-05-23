package com.cognizant.mc.calculator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @RequestMapping("add")
    public double add(double first, double second) {
        return first + second;
    }
}
