package com.jeipz.app.springboot.mongodb.service;

import com.jeipz.app.springboot.mongodb.collection.Person;
import com.jeipz.app.springboot.mongodb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public String save(Person person) {
        return personRepository.save(person).getPersonId();
    }
}
