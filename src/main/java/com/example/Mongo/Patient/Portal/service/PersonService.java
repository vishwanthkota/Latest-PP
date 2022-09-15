package com.example.Mongo.Patient.Portal.service;

import com.example.Mongo.Patient.Portal.collections.Person;
import com.example.Mongo.Patient.Portal.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;


    public String save(Person person) {
        return personRepo.save(person).toString();
    }


//    public String save(Person person) {
//        return personRepo.save(person).getPersonId();
//    }
}
