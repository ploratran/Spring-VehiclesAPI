package com.udacity.pricing.domain.price;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Represents the price of a given vehicle, including currency.
 */

@Entity
public class Price {

    // attributes:
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="vehicleid") // define column attribute inside data.sql
    private Long vehicleId;

    private String currency;
    private BigDecimal price;

    // private Long vehicleId;

    // constructors:
    public Price() {
    }

    public Price(String currency, BigDecimal price, Long vehicleId) {
        this.currency = currency;
        this.price = price;
        this.vehicleId = vehicleId;
    }

    // getters and setters:
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
}
