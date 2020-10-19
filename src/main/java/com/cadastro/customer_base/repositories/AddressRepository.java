package com.cadastro.customer_base.repositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AddressRepository {

    private final JdbcTemplate jdbc;

    public AddressRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public boolean exists(int id){
        StringBuilder query = new StringBuilder();
        query.append("SELECT COUNT(*) FROM CUSTOMER WHERE DOCUMENT_NUMBER = "+ id);
        return (jdbc.queryForObject(query.toString(), new Object[]{id}, Integer.class)==1);
    }

}
