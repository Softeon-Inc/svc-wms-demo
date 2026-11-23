package com.softeon.svc.service;

import org.springframework.stereotype.Service;

@Service
public class OrderValidationService {

    public boolean isValidQuantity(int quantity) {
        return quantity > 0 && quantity <= 1000;
    }

    public double calculateTotalPrice(int quantity, double unitPrice) {

        if (!isValidQuantity(quantity)) {
            throw new IllegalArgumentException(
                    "Quantity must be between 1 and 1000");
        }

        if (unitPrice < 0) {
            throw new IllegalArgumentException(
                    "Unit price cannot be negative");
        }

        return quantity * unitPrice;
    }
}