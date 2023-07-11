package com.example.springdatabasicdemo.repositories;

import com.example.springdatabasicdemo.models.Bike;
import com.example.springdatabasicdemo.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {
    List<Bike> findAllById(Long id);
}
