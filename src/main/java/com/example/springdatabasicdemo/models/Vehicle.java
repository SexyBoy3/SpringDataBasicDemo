package com.example.springdatabasicdemo.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Vehicle")
public abstract class Vehicle {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name="type",length = 255,nullable = false)
    protected String type;
    @Column(name="model",length = 255,nullable = false)
    protected String model;
    @Column(name="price",length = 255,nullable = false)
    protected BigDecimal price;
    @Column(name="fueltype",length = 255,nullable = false)
    protected String fueltypel;

    protected Vehicle(String type,String model,BigDecimal price,String fueltypel){
        this.type=type;
        this.model=model;
        this.price=price;
        this.fueltypel=fueltypel;
    }
    protected Vehicle(){}
    public Long getId() {return id;}
    protected void setId(Long id) {this.id = id;}
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public BigDecimal getPrice() {return price;}
    public void setPrice(BigDecimal price) {this.price = price;}
    public String getFueltypel() {return fueltypel;}
    public void setFueltypel(String fueltypel) {this.fueltypel = fueltypel;}
}
