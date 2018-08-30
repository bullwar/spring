package ru.alexander.repository;

import org.springframework.data.repository.CrudRepository;
import ru.alexander.entity.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
//    List<Customer> findAllByName(String name);
}
