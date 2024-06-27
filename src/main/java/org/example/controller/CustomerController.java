package org.example.controller;

import org.example.model.Customer;
import org.example.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customers")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("/list");
        List<Customer> customerList = customerService.selectAll();
        modelAndView.addObject("customer", customerList);
        return modelAndView;
    }

}
