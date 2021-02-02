package com.udacity.vehicles.domain.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * provide a type of data persistence while the web service runs
 * related to vehicle information received in the CarService
 * @Repository of Spring Data JPA
 * */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
