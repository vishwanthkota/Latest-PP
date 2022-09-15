package com.example.Mongo.Patient.Portal.service;

import com.example.Mongo.Patient.Portal.collections.RegistrationDetails;
import com.example.Mongo.Patient.Portal.dto.DemographicsDto;
import com.example.Mongo.Patient.Portal.repo.Demographics;
import com.example.Mongo.Patient.Portal.repo.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class commonServices  {

    @Autowired
    private Demographics demographicsRepo;
    @Autowired
    public RegistrationRepo registrationRepo;

    public DemographicsDto saveDemographics(DemographicsDto demographics)
    {

        if(demographicsRepo.existsById(demographics.patientId))
        {
            System.out.println("saved");

            return  demographicsRepo.save(demographics);
        }else
        {
            System.out.println("inserted");
            return  demographicsRepo.insert(demographics);
        }

    }
}
