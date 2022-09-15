package com.example.Mongo.Patient.Portal.repo;

import com.example.Mongo.Patient.Portal.collections.UsersLogin;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
public interface UserRepo extends MongoRepository<UsersLogin,String> {
    UsersLogin getByUsername(String username);

//    UsersLogin getByUsername(String username);
}
