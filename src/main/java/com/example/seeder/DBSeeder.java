package com.example.seeder;

import com.example.order.model.PickUpPoint;
import com.example.repository.PickUpPointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DBSeeder implements CommandLineRunner {
    private final PickUpPointRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // Clear the existing data if needed
        repository.deleteAll();

        // Seed data
        List<PickUpPoint> pickUpPoints = Arrays.asList(
                new PickUpPoint().name("Plaza Galerias").address(" Av Rafael Sanzio 150, Camichines Vallarta, 45020 Zapopan, Jal."),
                new PickUpPoint().name("Starbucks Coordilleras").address("Av. Manuel J. Clouthier 888, Centro Comercial Soriana Col, Jardines del Tepeyac, 45034 Zapopan, Jal."),
                new PickUpPoint().name("Chapalita").address("Av Guadalupe 3171, Chapalita, 45040 Zapopan, Jal.")
        );

        repository.saveAll(pickUpPoints);

        System.out.println("Database seeding completed.");
    }
}
