package com.swjd.controller;

import com.swjd.bean.Customer;
import com.swjd.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerServiceImpl cs;

    @RequestMapping("/a1")
    public String a(Model model){
        List<Customer> customerList=new ArrayList<>();
        customerList=cs.getAll();
        model.addAttribute("customer",customerList);
        System.out.println(customerList);
        return "ok";
    }
}
