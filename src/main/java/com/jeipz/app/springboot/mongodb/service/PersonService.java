package com.jeipz.app.springboot.mongodb.service;

import com.jeipz.app.springboot.mongodb.collection.Person;

public interface PersonService {
    String save(Person person);
}
