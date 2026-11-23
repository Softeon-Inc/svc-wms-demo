package com.softeon.wms.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderValidationServiceTest {

    private final OrderValidationService service =
        new OrderValidationService();

    @Test
    void shouldReturnTrueForValidQuantity() {
        assertTrue(service.isValidQuantity(10));
    }

    @Test
    void shouldReturnFalseForInvalidQuantity() {
        assertFalse(service.isValidQuantity(0));
    }

    @Test
    void shouldCalculateTotalPrice() {
        assertEquals(
                100.0,
                service.calculateTotalPrice(10, 10.0)
        );
    }

    @Test
    void shouldThrowExceptionForInvalidQuantity() {
        assertThrows(
                IllegalArgumentException.class,
                () -> service.calculateTotalPrice(0, 10.0)
        );
    }
}