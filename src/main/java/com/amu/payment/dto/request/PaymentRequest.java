package com.amu.payment.dto.request;

import com.amu.payment.entities.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        Integer id,
        BigDecimal amount,
        PaymentMethod method,
        Integer orderId,
        String orderReference,
        Customer customer
) {
}
