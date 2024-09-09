package com.example.controller;

import com.example.order.api.OrderApi;
import com.example.order.model.Order;
import com.example.order.model.PickUpPoint;
import com.example.service.OrderService;
import com.example.service.PickUpPointService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderAPIController implements OrderApi {

    private final OrderService service;
    private final PickUpPointService PickUpService;


    @Override
    public ResponseEntity<Order> addOrder(@Valid @RequestBody Order order) {
        log.info("Received Order with pickUpPoint: {}", order.getPickUpPoint());
        //PickUpPoint point = PickUpService.getPickUpPointByName(order.getPickUpPoint());
        PickUpService.findByName(order.getPickUpPoint())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "PickUpPoint not found"));

        Order savedOrder = service.addOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedOrder);
    }
}
