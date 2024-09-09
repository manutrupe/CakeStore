package com.example.service;

import com.example.order.model.PickUpPoint;
import com.example.repository.PickUpPointRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PickUpPointService {

    private final PickUpPointRepository repository;
    public Optional<PickUpPoint> findByName(String name){
        PickUpPoint point = repository.findByName(name);
        return Optional.of(point);
    }
}
