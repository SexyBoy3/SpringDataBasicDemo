package com.example.springdatabasicdemo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "Plane")
public class Plane extends Vehicle{
    private final static String type = "Plane";
    @Column(name = "airline",length = 50, nullable = false)
    private String airline;
    @Column(name = "passengerCapacity",length = 50, nullable = false)
    private int passengerCapacity;
    public int getPassengerCapacity() {return passengerCapacity;}
    public void setPassengerCapacity(int passengerCapacity) {this.passengerCapacity = passengerCapacity;}
    protected Plane(){}
    public Plane(String model, BigDecimal price, String fueltype, String airline, int passengerCapacity) {
        super(type,model,price,fueltype);
        this.airline=airline;
        this.passengerCapacity = passengerCapacity;}

    public int getpassengercapacity() {return passengerCapacity;}
}
