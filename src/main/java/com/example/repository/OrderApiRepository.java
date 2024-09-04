package com.example.repository;

import com.example.order.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderApiRepository extends MongoRepository<Order,String> {

}
