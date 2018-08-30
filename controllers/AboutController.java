package ru.alexander.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.alexander.components.CustomerComponent;

import java.util.Map;

@Controller
public class AboutController {
    @Autowired
    CustomerComponent customerComponent;

    @RequestMapping("/about")
    public String about(Map<String, Object> model) {
        model.put("customers", customerComponent.getAllCustomers());
        return "about";
    }

    @RequestMapping(value = "/about/add_new_customer", method = RequestMethod.POST)
    @ResponseBody
    public String addNewCustomer(@RequestParam("customer_name") String customerName) {
        customerComponent.addNewCustomer(customerName);
        return "ok";
    }
}
