package ru.alexander.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.alexander.components.CustomerComponent;
import ru.alexander.entity.Customer;
import ru.alexander.repository.CustomerRepository;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Controller
public class WelcomeController {
    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", "Alexander");
        return "welcome";
    }

    @RequestMapping(value = "/printme/{data}", method = RequestMethod.GET)
    public String printme(Map<String, Object> model, @PathVariable("data") String data) {
        model.put("data", data);
        return "printme";
    }
}
