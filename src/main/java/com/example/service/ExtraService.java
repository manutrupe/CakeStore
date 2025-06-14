package com.example.service;

import com.example.order.model.Extra;
import com.example.repository.ExtraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExtraService {
    private final ExtraRepository repository;

    public Extra addExtra(Extra extra){
        return repository.save(extra);
    }
}
