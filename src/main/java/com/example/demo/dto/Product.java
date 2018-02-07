package com.example.demo.dto;

import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name= "Product_Information")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    @Column(name="Product_Name")
    @Size(min = 3,max=20,message = "must be minimum 3 or maximum 20 character")
    @Pattern(regexp = "[^0~9]+")
    private String Name;
    @Column(name="Product_Description")
    @Size(min = 5,message = "must be minimum 5 character")
    private String Description;
    @Column(name="Product_Origin")
    @NotEmpty
    private String origin;
    @Column(name="Gender")
    @Size(message = "Select Atleast One")
    private String gender;
    @Column(name="Product_Buying_Price")
    @NotNull(message = "Can't be Empty")
    private Integer buyingprice;
    @Column(name="Product_Quantity")
    @NotNull(message = "Can't be Empty")
    private Integer quantity;
    @Column(name="Product_Quality")
    @NotEmpty(message = "Can't be Empty")
    private String quality;

    public Product() {
    }

    public Product(Integer id, String name, String description, String origin, String gender, Integer buyingprice, Integer quantity, String quality) {
        this.id = id;
        Name = name;
        Description = description;
        this.origin = origin;
        this.gender = gender;
        this.buyingprice = buyingprice;
        this.quantity = quantity;
        this.quality = quality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getBuyingprice() {
        return buyingprice;
    }

    public void setBuyingprice(Integer buyingprice) {
        this.buyingprice = buyingprice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
