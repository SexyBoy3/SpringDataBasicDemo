package com.example.springdatabasicdemo.repositories;
import com.example.springdatabasicdemo.models.Car;
import com.example.springdatabasicdemo.models.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaneRepository extends JpaRepository<Plane,Long>{

}
