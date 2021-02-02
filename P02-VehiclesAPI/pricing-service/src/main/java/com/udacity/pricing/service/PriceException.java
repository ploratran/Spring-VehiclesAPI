package com.udacity.pricing.service;

// thrown when an issue arises in the PricingService
public class PriceException extends Exception {

    public PriceException(String message) {
        super(message);
    }
}
