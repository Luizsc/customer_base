package com.cadastro.customer_base.repositories;

import com.cadastro.customer_base.models.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

    private final JdbcTemplate jdbc;

    public CustomerRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public boolean exists(String docNumber) {
        final String query = "SELECT COUNT(*) FROM CUSTOMER WHERE DOCUMENT_NUMBER = " + docNumber;
        return (jdbc.queryForObject(query, new Object[]{docNumber}, Integer.class) == 1);
    }

    private final String persist = new StringBuilder()
                .append("UPDATE CUSTOMER SET")
                .append("ID = ?, ")
                .append("NAME = ?, ")
                .append("GENDER = ?, ")
                .append("DOCUMENT_NUMBER = ?, ")
                .append("DOCUMENT_TYPE = ?, ")
                .append("ADDRESS_ID = ?, ")
                .append("HOUR_LOGGIN = ?")
                .toString();
    }
    public boolean persistCustomer(Customer customer) {


    }

}






