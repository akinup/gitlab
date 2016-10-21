package com.prodyna.ted.repo;

import com.prodyna.ted.pojo.Person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonResource {

    @Autowired
    private PersonRepository repo;

    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public HttpEntity<List<Person>> getPersons() {
        return new ResponseEntity<>(this.repo.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/newPerson", method = RequestMethod.POST)
    public ResponseEntity<Person> addPerson(@RequestBody final Person name) {
        this.repo.save(name);

        return new ResponseEntity<>(name, HttpStatus.CREATED);

    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public HttpEntity<String> test() {
        return new ResponseEntity<>("laeuft", HttpStatus.OK);
    }

}
