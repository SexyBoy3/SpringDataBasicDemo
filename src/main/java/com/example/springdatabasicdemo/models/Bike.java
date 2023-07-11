package com.example.springdatabasicdemo.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Bike")
public class Bike extends Vehicle{
    private final static String type = "Bike";

    public Bike(String model, BigDecimal price, String fueltype){
        super(type,model,price,fueltype);
    }
    protected Bike(){}
}
