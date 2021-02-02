package com.udacity.vehicles.domain;

import javax.persistence.Embeddable;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

/**
 * Stores information about a given location.
 * Latitude and longitude must be provided, while other
 * location information must be gathered each time from
 * the maps API.
*/


/**
 * This declares information about the location of a vehicle.
 * This is not the exact same as the Address class used by boogle-maps
 * - it's primary use is related to the storage of latitude and longitude values.
 * Because the data, such as address, gathered from boogle-maps
 * is annotated as @Transient, this data is not stored until the next time boogle-maps is called.
 * */
@Embeddable
public class Location {

    @NotNull
    private Double lat;

    @NotNull
    private Double lon;

    @Transient
    private String address; // Price Boogle Map must be called each time price is desired

    @Transient
    private String city; // Price Boogle Map must be called each time price is desired

    @Transient
    private String state; // Price Boogle Map must be called each time price is desired

    @Transient
    private String zip; // Price Boogle Map must be called each time price is desired

    public Location() {
    }

    public Location(Double lat, Double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
