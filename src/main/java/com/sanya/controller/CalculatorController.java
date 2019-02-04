package com.sanya.controller;

import com.sanya.calculator.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

   /* @RequestMapping(value = { "/calculator/add" }, method = RequestMethod.GET)
    public String showAddPersonPage(Model model) {

        PersonForm personForm = new PersonForm();
        model.addAttribute("personForm", personForm);

        return "addPerson";
    }*/




    @Autowired
    CalculatorService calculatorService;
    @RequestMapping(value = {"/calculator/add"}, method = RequestMethod.GET)
    public Long add(@RequestParam("param1") Integer arg1, @RequestParam("param2") Integer arg2) {
        return calculatorService.calculate(1, arg1, arg2);
    }
    @GetMapping("/calculator/min")
    public Long min(@RequestParam("param1") Integer arg1, @RequestParam("param2") Integer arg2) {
        return calculatorService.calculate(2, arg1, arg2);
    }
    @GetMapping("/calculator/mul")
    public Long mul(@RequestParam("param1") Integer arg1, @RequestParam("param2") Integer arg2) {
        return calculatorService.calculate(3, arg1, arg2);
    }
    @GetMapping("/calculator/div")
    public Long div(@RequestParam("param1") Integer arg1, @RequestParam("param2") Integer arg2) {
        return calculatorService.calculate(4, arg1, arg2);
    }
}
