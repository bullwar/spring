package ru.alexander.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.alexander.entity.Customer;
import ru.alexander.repository.CustomerRepository;

import java.sql.Date;
import java.util.List;

@Component
public class CustomerComponent {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return (List<Customer>)customerRepository.findAll();
    }

    public void addNewCustomer(String name) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(name + "@gmail.com");
        customer.setDate(new Date(2017, 10, 10));
        customerRepository.save(customer);
    }
}
