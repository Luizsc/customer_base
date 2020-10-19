package com.cadastro.customer_base.repositories.mappers;


import com.cadastro.customer_base.models.Address;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class AddressMapper implements RowMapper<Address> {

    @Override
    public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
        Address ad = new Address();
        ad.setId(rs.getInt("ID"));
        ad.setCity(rs.getString("CITY"));
        ad.setCountry(rs.getString("COUNTRY"));
        ad.setNumber(rs.getString("NUMBER"));
        ad.setState(rs.getString("STATE"));
        ad.setStreet(rs.getString("STREET"));

        return ad;
    }
}
