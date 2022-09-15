package com.example.Mongo.Patient.Portal.service;

import com.example.Mongo.Patient.Portal.collections.RegistrationDetails;
import com.example.Mongo.Patient.Portal.repo.Allergies;
import com.example.Mongo.Patient.Portal.repo.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AllergiesService {

    @Autowired
    public Allergies allergiesRepo;

    @Autowired
    public RegistrationRepo registrationRepo;

    public List<com.example.Mongo.Patient.Portal.collections.Allergies> getAllergiesData()
    {
        System.out.println( allergiesRepo.findAll());
        return  allergiesRepo.findAll();
    }


}
