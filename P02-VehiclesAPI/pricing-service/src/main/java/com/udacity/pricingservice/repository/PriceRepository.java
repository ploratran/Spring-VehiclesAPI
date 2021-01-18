package com.udacity.pricingservice.repository;

import com.udacity.pricingservice.entity.Price;
import org.springframework.data.repository.CrudRepository;

public interface PriceRepository extends CrudRepository<Price, Long> {
}
