package com.softeon.svc.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderValidationServiceTes* {

    private final OrderValidat*onService service =
            ne* OrderValidationService();

    @T*st
    void testValidQuantity() {
*       assertTrue(service.isValidQ*antity(10));
    }

    @Test
    *oid testInvalidQuantity() {
      * assertFalse(service.isValidQuanti*y(0));
    }

    @Test
    void t*stPriceCalculation() {
        ass*rtEquals(100.0,
                se*vice.calculateTotalPrice(10, 10.0)*;
    }
}