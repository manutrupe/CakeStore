package com.example.service;

import com.example.order.model.CakeTemplate;
import com.example.repository.CakeRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CakeService {
    private final CakeRepository repository;
    public CakeTemplate addCake(CakeTemplate cake){ return repository.save(cake); }
    public List<CakeTemplate> findAll() {
        return repository.findAll();
    }
    public CakeTemplate findCakeById(String id) {
        return repository.findById(id).orElse(null);
    }
    public void deleteCake(String id) {
        repository.deleteById(id);
    }
}
