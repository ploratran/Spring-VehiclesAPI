package com.udacity.vehicles.domain.manufacturer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * provide a type of data persistence while the web service runs,
 * primarily to store manufacturer information like that
 * initialized in VehiclesApiApplication.
 * @Repository: Spring Data JPA
 * */
@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {

}
