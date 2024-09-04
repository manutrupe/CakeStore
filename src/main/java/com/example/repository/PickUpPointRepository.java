package com.example.repository;

import com.example.order.model.PickUpPoint;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PickUpPointRepository extends MongoRepository<PickUpPoint, String> {
}
