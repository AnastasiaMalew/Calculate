package com.calculate.calculate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {
    @GetMapping("/calculator")
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/calculator/plus")
    public String getSummary(@RequestParam(value = "num1") Integer num1,
                             @RequestParam(value = "num2") Integer num2) {
        if(num1==null || num2 ==null) {
            return "Один из парметров осутствует";
        }
        return num1 + " + " + num2 + " = " + (num1+num2);
    }
    @GetMapping("/calculator/minus")
    public String getSubtraction(@RequestParam(value = "num1") Integer num1,
                                 @RequestParam(value = "num2") Integer num2) {
        if(num1==null || num2 ==null) {
            return "Один из парметров осутствует";
        }
        return num1 + " - " + num2 + " = " + (num1-num2);
    }
    @GetMapping("/calculator/multiply")
    public String getMultiply(@RequestParam(value = "num1") Integer num1,
                                 @RequestParam(value = "num2") Integer num2) {
        if(num1==null || num2 ==null) {
            return "Один из парметров осутствует";
        }
        return num1 + " * " + num2 + " = " + (num1*num2);
    }
    @GetMapping("/calculator/divide")
    public String getDivision(@RequestParam(value = "num1") Integer num1,
                                 @RequestParam(value = "num2") Integer num2) {
        if (num2==0) {
           return  "Нельзя делить на ноль";
        }
        return num1 + " / " + num2 + " = " + (num1/num2);
    }

}
