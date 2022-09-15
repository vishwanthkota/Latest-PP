package com.example.Mongo.Patient.Portal.controller;

import com.example.Mongo.Patient.Portal.collections.Allergies;
import com.example.Mongo.Patient.Portal.collections.Person;
import com.example.Mongo.Patient.Portal.collections.RegistrationDetails;
import com.example.Mongo.Patient.Portal.collections.UsersLogin;
import com.example.Mongo.Patient.Portal.dto.DemographicsDto;
import com.example.Mongo.Patient.Portal.dto.RegistrationDto;
import com.example.Mongo.Patient.Portal.service.AllergiesService;
import com.example.Mongo.Patient.Portal.service.PersonService;
import com.example.Mongo.Patient.Portal.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/patient")
public class controller {

    @Autowired
    private PersonService personService;

    @Autowired
    private AllergiesService allergiesService;
    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private com.example.Mongo.Patient.Portal.service.commonServices commonServices;

    @PostMapping
    public String save(@RequestBody Person person) {
        return personService.save(person);
    }

    @GetMapping("/allergies")
    public List<Allergies> getAllergies() {
        return allergiesService.getAllergiesData();
    }

    @PostMapping("/registration")
    public RegistrationDto register(@RequestBody RegistrationDetails registrationDetails)
    {
            return registrationService.saveRegistrationData(registrationDetails);
    }
    @PostMapping(value = "/login",consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RegistrationDto> loginSecurity(@RequestBody UsersLogin userdata)
    {
        System.out.println(userdata.getUsername());
        System.out.println(userdata.getPassword());

        RegistrationDto employee = registrationService.findByUsername(userdata);
        return  new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/demographics")
    public DemographicsDto updateDemographics(@RequestBody DemographicsDto demographics)
    {
        return commonServices.saveDemographics(demographics);
    }

}
