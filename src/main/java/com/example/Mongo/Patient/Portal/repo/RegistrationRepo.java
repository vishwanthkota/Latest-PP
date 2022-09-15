package com.example.Mongo.Patient.Portal.repo;

import com.example.Mongo.Patient.Portal.collections.Demographics;
import com.example.Mongo.Patient.Portal.collections.RegistrationDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories


public interface RegistrationRepo extends MongoRepository<RegistrationDetails,String> {

    Demographics insert(Demographics demographics);

    RegistrationDetails findFirstByUsername(String username);


//    RegistrationDetails findByUsername(String username);
}
