package com.example.service;

import com.example.order.model.Order;
import com.example.repository.OrderApiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderApiRepository repository;

    public Order addOrder(Order order){
        return repository.save(order);
    }
}
