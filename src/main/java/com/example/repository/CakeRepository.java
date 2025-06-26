package com.example.repository;

import com.example.order.model.CakeTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CakeRepository extends MongoRepository<CakeTemplate, String> {
}
