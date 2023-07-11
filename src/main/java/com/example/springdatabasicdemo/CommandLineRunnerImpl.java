package com.example.springdatabasicdemo;


import com.example.springdatabasicdemo.models.Car;
import com.example.springdatabasicdemo.repositories.BikeRepository;

import com.example.springdatabasicdemo.repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

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

        printAllGroups();
        printAllStudents();
        printAllStudentsByGroupName("UVP-212");

    }

    private void printAllCarsById(Long id) {
        CarRepository
                .findAllById(id)
                .forEach(System.out::println);
    }

    private void printAllGroups() {
        groupRepository
                .findAll()
                .forEach(System.out::println);
    }

    private void printAllStudents() {
        studentRepository
                .findAll()
                .forEach(System.out::println);
    }

    private void seedData() throws IOException {
        //Добавление в БД записей
        Student s1 = new Student("Petr Ivanov");
        Student s2 = new Student("Ivan Petrov");
        Group g1 = new Group("UVP-211");
        Group g2 = new Group("UVP-212");

        s1.setGroup(g1);
        s2.setGroup(g2);

        studentRepository.save(s1);
        studentRepository.save(s2);
    }
}
