package com.example.Mongo.Patient.Portal.repo;

import com.example.Mongo.Patient.Portal.collections.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@EnableMongoRepositories
public interface PersonRepo  extends MongoRepository<Person,String> {
}
