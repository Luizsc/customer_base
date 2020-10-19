package com.cadastro.customer_base.models;

import lombok.Data;


public @Data class Customer {
    private int id;
    private String name;
    private String gender;
    private String documentNumber;
    private String documentType;
    private int addressId;
}
