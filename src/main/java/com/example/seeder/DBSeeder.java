package com.example.seeder;

import com.example.order.model.Extra;
import com.example.order.model.PickUpPoint;
import com.example.repository.ExtraRepository;
import com.example.repository.PickUpPointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;


@Component
@RequiredArgsConstructor
public class DBSeeder implements CommandLineRunner {
    private final PickUpPointRepository pickUpPointRepository;
    private final ExtraRepository extraRepository;

    @Override
    public void run(String... args) throws Exception {
        // Clear the existing data if needed
        pickUpPointRepository.deleteAll();
        extraRepository.deleteAll();


        // Seed data
        List<PickUpPoint> pickUpPoints = Arrays.asList(
                new PickUpPoint().name("Plaza Galerias").address(" Av Rafael Sanzio 150, Camichines Vallarta, 45020 Zapopan, Jal."),
                new PickUpPoint().name("Starbucks Coordilleras").address("Av. Manuel J. Clouthier 888, Centro Comercial Soriana Col, Jardines del Tepeyac, 45034 Zapopan, Jal."),
                new PickUpPoint().name("Chapalita").address("Av Guadalupe 3171, Chapalita, 45040 Zapopan, Jal.")
        );

        //pickUpPointRepository.saveAll(pickUpPoints);
        System.out.println("Database seeding pick Up point complete.");

     /*    List<Extra> extras = Arrays.asList(
                new Extra().name("Perlas").price(new BigDecimal("20")),
                new Extra().name("Moños").price(new BigDecimal("10")),
                new Extra().name("Flores Naturales").price(new BigDecimal("100")),
                new Extra().name("Cerezas").price(new BigDecimal("20")),
                new Extra().name("Brillantina").price(new BigDecimal("10")),
                new Extra().name("Flores mantequila").price(new BigDecimal("50"))
        );
*/
        //extraRepository.saveAll(extras);
        System.out.println("Database seeding for extras complete.");

        System.out.println("Database seeding completed.");
    }
}
