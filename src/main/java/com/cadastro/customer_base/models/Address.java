package com.cadastro.customer_base.models;

import lombok.Data;


public @Data class Address {

    private int id;
    private String street;
    private String number;
    private String city;
    private String state;
    private String country;


}
