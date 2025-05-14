package com.amu.payment.service;

import com.amu.payment.dto.request.PaymentRequest;
import com.amu.payment.mapper.PaymentMapper;
import com.amu.payment.repositories.PaymentRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository repository;
    private final PaymentMapper mapper;

    public Integer createPayment(@Valid PaymentRequest request) {
        var payment = repository.save(mapper.toPayment(request));
        return null;
    }
}
