package com.example.Mongo.Patient.Portal.repo;


import com.example.Mongo.Patient.Portal.dto.DemographicsDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
public interface Demographics extends
        MongoRepository<DemographicsDto,String> {
}
