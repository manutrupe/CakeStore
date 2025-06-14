package com.example.repository;

import com.example.order.model.Extra;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExtraRepository extends MongoRepository<Extra, String> {
}
