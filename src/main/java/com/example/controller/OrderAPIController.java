package com.example.controller;

import com.example.order.api.OrderApi;
import com.example.order.model.Order;
import com.example.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class OrderAPIController implements OrderApi {

    private final OrderService service;

    @Override
    public ResponseEntity<Order> addOrder(@Valid @RequestBody Order order) {
        Order savedOrder = service.addOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedOrder);
    }
}
