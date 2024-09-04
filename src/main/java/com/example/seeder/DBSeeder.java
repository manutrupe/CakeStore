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
                new PickUpPoint("123 Main St", "Main Branch"),
                new PickUpPoint("456 Elm St", "Elm Branch"),
                new PickUpPoint("789 Oak St", "Oak Branch")
        );

        repository.saveAll(pickUpPoints);

        System.out.println("Database seeding completed.");
    }
}
