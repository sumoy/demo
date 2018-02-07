package com.example.demo.Service;

import com.example.demo.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service public class ProductService {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public void insertproduct(Product product){
        String query = "INSERT INTO Product_Information(Product_Name,Product_Description,Product_Origin,Gender,Product_Buying_Price,Product_Quantity,Product_Quality) values(?,?,?,?,?,?,?)";
        jdbcTemplate.update(query,product.getName(),product.getDescription(),product.getOrigin(),product.getGender(),product.getBuyingprice(),product.getQuantity(),product.getQuality());
    }
/**    public Product getproductbyid(Integer id){
        String getuserbyid = "Select Product_Name,Product_Description,Product_Origin,Gender,Product_Buying_Price,Product_Quantity,Product_Quality from Product_Information WHERE id = "+id+"";
        Product product = jdbcTemplate.queryForObject(getuserbyid , new ProductRowMapper());
        return product;
     }
**/
    public void deleteproduct(Integer id){
        String query = "DELETE FROM Product_Information WHERE id = "+id+"";
        jdbcTemplate.update(query);
    }
}
