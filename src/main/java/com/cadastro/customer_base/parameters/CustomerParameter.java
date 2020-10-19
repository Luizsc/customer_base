package com.cadastro.customer_base.parameters;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerParameter {

    private String name;
    private String gender;
    private String documentNumber;
    private String documentType;
    private AddressParameter address;
}
