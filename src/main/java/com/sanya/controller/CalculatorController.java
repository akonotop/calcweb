package com.sanya.controller;

import com.sanya.calculator.CalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("operation", "+");
/*
        model.addAttribute("view", "views/calc-layout");
*/
        return "calc-layout";
    }

    @PostMapping("/")
    public String index(
            @RequestParam String leftString,
            @RequestParam String operation,
            @RequestParam String rightString,
            Model model
    ) {
        double leftNumber;
        double rightNumber;

        try {
            leftNumber = Double.parseDouble(leftString);
        }
        catch (NumberFormatException e) {
            leftNumber = 0;
        }

        try {
            rightNumber = Double.parseDouble(rightString);
        }
        catch (NumberFormatException e) {
            rightNumber = 0;
        }

        CalculatorService cs = new CalculatorService(leftNumber, rightNumber, operation);

        double result =  cs.calculate();

        model.addAttribute("leftString", leftNumber);
        model.addAttribute("operation", operation);
        model.addAttribute("rightString", rightNumber);
        model.addAttribute("result", result);

/*
        model.addAttribute("view", "views/calc-layout");
*/
        return "calc-layout";
    }
}
