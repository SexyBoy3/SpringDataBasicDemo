package com.example.springdatabasicdemo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "Truck")
public class Truck extends Vehicle {
    private static final String type = "Truck";
    @Column(name = "loadCapacity",length = 50, nullable = false)
    protected Double loadCapacity;
    public Truck(String model, BigDecimal price, String fuelype, Double loadCapacity) {
        super(type,model,price,fuelype);
        this.loadCapacity = loadCapacity;}
    // Пустой конструктор для Hibernate, обратите внимание на модификатор доступа
    protected Truck(){}
    public Double getloadCapacity() {return loadCapacity;}
    private void setLoadCapacity(String name) {this.loadCapacity = loadCapacity;}
}
