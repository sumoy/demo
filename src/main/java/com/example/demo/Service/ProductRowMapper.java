
package com.example.demo.Service;

/** import com.example.demo.dto.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product maprow(ResultSet rs,Integer rownum) throws SQLException {

        Product product = new Product();
        product.setName(rs.getString("Product_Name"));
        product.setName(rs.getString("Product_Description"));
        product.setName(rs.getString("Product_Origin"));
        product.setName(rs.getString("Gender"));
        product.setName(rs.getString("Product_Buying_Price"));s
        product.setName(rs.getString("Product_Quantity"));
        product.setName(rs.getString("Product_Quality"));
        return product;
    }



} **/
public class ProductRowMapper{

}

