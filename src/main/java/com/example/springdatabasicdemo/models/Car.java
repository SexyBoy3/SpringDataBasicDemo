package com.example.springdatabasicdemo.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Car")
public class Car extends Vehicle{
    private final static String type ="Car";
    @Column(name="seats",length = 50, nullable = false)
    private int seats;
    public int getSeats() {return seats;}
    public void setSeats(int seats) {this.seats = seats;}
    public Car(String model, BigDecimal price, String fueltype, int seats) {
        super(type,model,price,fueltype);
        this.seats = seats;
    }
    protected Car(){}

    public int getseats() {return seats;}
}
