package com.prodyna.ted;

import com.prodyna.ted.pojo.Person;
import com.prodyna.ted.repo.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private PersonRepository repository;

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {

        this.repository.deleteAll();

        this.repository.save(new Person("Bob"));

        final Person result = this.repository.findByName("Bob");
        System.out.println(result);


    }
}
