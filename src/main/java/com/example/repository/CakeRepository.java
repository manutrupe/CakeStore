package com.example.repository;

import com.example.order.model.Cake;
import org.apache.el.parser.AstGreaterThan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CakeRepository extends MongoRepository<Cake, String> {
}
