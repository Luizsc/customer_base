package com.cadastro.customer_base.repositories.mappers;

import com.cadastro.customer_base.models.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class CustomerMapper implements RowMapper<Customer> {
    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Customer cm = new Customer();

        cm.setDocumentNumber(rs.getString("DOCUMENT_NUMBER"));
        cm.setDocumentType(rs.getString("DOCUMENT_TYPE"));
        cm.setGender(rs.getString("GENDER"));
        cm.setName(rs.getString("NAME"));
        cm.setId(rs.getInt("ID"));
        cm.setAddressId(rs.getInt("ADDRESS_ID"));

        return cm;
    }
}
