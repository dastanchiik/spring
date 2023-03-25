package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Component
public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    @Value("${person.animal}")
    private String animal;
}
