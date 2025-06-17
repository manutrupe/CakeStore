package com.example.controller;

import com.example.order.api.DefaultApi;
import com.example.order.model.CakeSize;
import com.example.order.model.CakeType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CakeController implements DefaultApi {

    @Override
    public ResponseEntity<List<CakeSize>> cakeSizesGet() {
        List<CakeSize> cakeSizes = Arrays.asList(CakeSize.values());
        return ResponseEntity.status(HttpStatus.OK).body(cakeSizes);
    }

    @Override
    public ResponseEntity<List<CakeType>> cakeTypesGet() {
        List<CakeType> cakeTypes = Arrays.asList(CakeType.values());
        return ResponseEntity.status(HttpStatus.OK).body(cakeTypes);
    }


}
