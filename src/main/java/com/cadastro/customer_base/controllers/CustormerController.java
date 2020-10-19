package com.cadastro.customer_base.controllers;

import com.cadastro.customer_base.dataholders.CustomerDataHolder;
import com.cadastro.customer_base.parameters.CustomerParameter;
import com.cadastro.customer_base.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustormerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers")
    public ResponseEntity<?> saveCustomerData(@RequestBody CustomerParameter param, @RequestHeader HttpHeaders headers) {

        try {
            if (!customerService.exists(param.getDocumentNumber())) {
                customerService.persist(param, headers);
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new CustomerDataHolder("CLIENTE JÁ CADASTRADO EM NOSSA BANCO DE DADOS"));
            }
        } catch (Exception e) {

        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new CustomerDataHolder("NÃO FOI POSSIVEL REALIZAR O CADASTRO"));
    }


}
