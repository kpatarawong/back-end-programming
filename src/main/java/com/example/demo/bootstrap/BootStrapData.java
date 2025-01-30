package com.example.demo.bootstrap;

import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import com.example.demo.dao.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository){
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Customer jordan = new Customer();
        jordan.setFirstName("Jordan");
        jordan.setLastName("Smith");
        jordan.setAddress("123 Cheese lane");
        jordan.setPostal_code("12345");
        jordan.setPhone("1234567890");

        Customer michael = new Customer();
        michael.setFirstName("Michael");
        michael.setLastName("Jordan");
        michael.setAddress("32 Jordan Way");
        michael.setPostal_code("12346");
        michael.setPhone("1234567891");

        Customer steve = new Customer();
        steve.setFirstName("Steve");
        steve.setLastName("Doe");
        steve.setAddress("313 Steve Way");
        steve.setPostal_code("12347");
        steve.setPhone("1234567892");

        Customer joe = new Customer();
        joe.setFirstName("Joe");
        joe.setLastName("Smith");
        joe.setAddress("176 Smith Street");
        joe.setPostal_code("212348");
        joe.setPhone("1234567893");

        Customer nick = new Customer();
        nick.setFirstName("Nick");
        nick.setLastName("Rock");
        nick.setAddress("555 Rock Street");
        nick.setPostal_code("12349");
        nick.setPhone("1234567894");

        customerRepository.save(jordan);
        customerRepository.save(michael);
        customerRepository.save(steve);
        customerRepository.save(joe);
        customerRepository.save(nick);
    }

}