package com.example.service;

import com.example.order.model.Cake;
import com.example.repository.CakeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CakeService {
    private final CakeRepository repository;
    public Cake addCake(Cake cake){ return repository.save(cake); }
}
