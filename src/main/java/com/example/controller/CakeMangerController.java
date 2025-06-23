package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.api.CakeApi;
import com.example.order.model.CakeTemplate;
import com.example.service.CakeService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CakeMangerController implements CakeApi {

    private final CakeService service;
    
    @Override
    public ResponseEntity<CakeTemplate> addCake (CakeTemplate body) {
        CakeTemplate cake = service.addCake(body);
        return ResponseEntity.status(HttpStatus.OK).body(cake);
    }
}
