package com.example.springdatabasicdemo;


import com.example.springdatabasicdemo.models.Bike;
import com.example.springdatabasicdemo.models.Car;
import com.example.springdatabasicdemo.repositories.BikeRepository;

import com.example.springdatabasicdemo.repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    private final BikeRepository bikeRepository;
    private final CarRepository carRepository;

    public CommandLineRunnerImpl(BikeRepository bikeRepository, CarRepository carRepository) {
        this.bikeRepository = bikeRepository;
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        seedData();

        printAllBikes();
        printAllCars();
        printAllCarsById(Long.parseLong("12"));

    }

    private void printAllCarsById(Long id) {
        carRepository
                .findAllById(id)
                .forEach(System.out::println);
    }

    private void printAllBikes() {
        bikeRepository
                .findAll()
                .forEach(System.out::println);
    }

    private void printAllCars() {
        carRepository
                .findAll()
                .forEach(System.out::println);
    }

    private void seedData() throws IOException {
        //Добавление в БД записей
        Car c1 = new Car("Jiguli", BigDecimal.TEN,"92",5);
        Car c2 = new Car("Mazda", BigDecimal.ONE,"95",5);
        Bike b1 = new Bike("Ford", BigDecimal.valueOf(2),"95");
        Bike b2 = new Bike("BMW", BigDecimal.valueOf(7),"95");

        c1.getSeats();
        b1.getModel();

        carRepository.save(c1);
        bikeRepository.save(b2);
    }
}
