package com.example.Mongo.Patient.Portal.repo;

import com.vishwanth.Patient.Portal.models.UserDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.query.Param;

@EnableMongoRepositories

public interface UserDetailsRepo extends MongoRepository<UserDetails,String> {
    //    @Query(value = "select * from userdetails where username=:username",nativeQuery = true)
//    UserDetails fetchUserDetails(@Param("username") String username);
//    @Query("Select u from userdetails u WHERE u.username=:username")
//    UserDetails findByUsername(@Param("username") String username);
//    Optional<UserDetails> findUserById(String userName);

}
