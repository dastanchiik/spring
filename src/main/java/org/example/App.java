package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Configurations.class);
        Person person = (Person) app.getBean("person");
        System.out.println(person.getAnimal());
    }
}
