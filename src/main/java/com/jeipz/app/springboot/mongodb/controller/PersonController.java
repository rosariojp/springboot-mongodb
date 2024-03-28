package com.jeipz.app.springboot.mongodb.controller;

import com.jeipz.app.springboot.mongodb.collection.Person;
import com.jeipz.app.springboot.mongodb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public String save(@RequestBody Person person) {
        return personService.save(person);
    }

}
