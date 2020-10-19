package com.cadastro.customer_base.services;

import com.cadastro.customer_base.parameters.CustomerParameter;
import com.cadastro.customer_base.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public boolean exists(String docNumber) {
        return customerRepository.exists(docNumber);
    }

    public boolean persist(CustomerParameter param) {


        return null;
    }

}
