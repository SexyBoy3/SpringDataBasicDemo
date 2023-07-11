package com.example.springdatabasicdemo.repositories;

import com.example.springdatabasicdemo.models.Truck;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository <Truck, Integer> {
}
