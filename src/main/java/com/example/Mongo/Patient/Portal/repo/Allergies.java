package com.example.Mongo.Patient.Portal.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
public interface Allergies  extends MongoRepository<com.example.Mongo.Patient.Portal.collections.Allergies,String> {
}
