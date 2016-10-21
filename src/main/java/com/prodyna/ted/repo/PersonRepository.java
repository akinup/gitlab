package com.prodyna.ted.repo;

import com.prodyna.ted.pojo.Person;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {

    public Person findByName(String name);
}
