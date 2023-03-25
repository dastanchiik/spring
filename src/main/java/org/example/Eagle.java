package org.example;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Eagle implements Animal{
    @Value("${eagle.name}")
    private String name;
    @Value("${eagle.breed}")
    private String breed;

    @Override
    public void animalPlus() {
        System.out.println("can fly");
    }

    @Override
    public void animalMinus() {
        System.out.println("predator");
    }
}
