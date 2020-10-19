package com.cadastro.customer_base.parameters;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddressParameter {
    private String street;
    private String number;
    private String city;
    private String state;
    private String country;

}
