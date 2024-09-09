package com.example.repository;

import com.example.order.model.PickUpPoint;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PickUpPointRepository extends MongoRepository<PickUpPoint, String> {

    @Query("{name : ?0}")
    public PickUpPoint findByName(String name);
}
