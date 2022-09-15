package com.example.Mongo.Patient.Portal.service;

import com.example.Mongo.Patient.Portal.collections.RegistrationDetails;
import com.example.Mongo.Patient.Portal.collections.UsersLogin;
import com.example.Mongo.Patient.Portal.dto.RegistrationDto;
import com.example.Mongo.Patient.Portal.exceptions.UserNotFoundException;
import com.example.Mongo.Patient.Portal.repo.RegistrationRepo;
import com.example.Mongo.Patient.Portal.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepo registrationRepo;

    @Autowired
    private UserRepo userRepo;

    public RegistrationDto saveRegistrationData(RegistrationDetails registrationDetails) {

        System.out.println( );
        RegistrationDto registrationDto = new RegistrationDto();
        RegistrationDetails re = registrationRepo.findFirstByUsername(registrationDetails.getUsername());
        System.out.println("-------------------------------------------------");
        System.out.println(registrationRepo.existsById(registrationDetails.getUsername()));
        System.out.println("-------------------------------------------------");

//        Objects.equals(re.getUsername(), registrationDetails.getUsername())
        if(registrationRepo.existsById(registrationDetails.getUsername())) {
            System.out.println("UserName already exist please change the username");
            registrationDto.setRegistrationDetails(registrationDetails);
            registrationDto.setStatusMsg("UserName already exist please change the username");
        } else {
            System.out.println("UserName ");

            int min = 0;
            int max = 1000;
            String date = java.time.LocalDate.now().toString();
            registrationDetails.setRegDate(date);
            registrationDetails.setDemographics(null);
            registrationDetails.setScheduledAppointments(null);
            int b = (int) (Math.random() * (max - min + 1) + min);
            registrationDetails.setPatientId("PP" + b);
            registrationRepo.insert(registrationDetails);
            registrationDto.setRegistrationDetails(registrationDetails);

            registrationDto.setStatusMsg("Successfully Registered");
            UsersLogin usersLogin=new UsersLogin();
            usersLogin.setUsername(registrationDetails.getUsername());
            usersLogin.setPassword(registrationDetails.getPassword());

            userRepo.save(usersLogin);
        }
        return registrationDto;
    }

    public RegistrationDto findByUsername(UsersLogin userL) {
        if(userRepo.existsById(userL.getUsername()))
        {
            System.out.println("in2");

            UsersLogin lognput = new UsersLogin();
            lognput = userRepo.getByUsername(userL.getUsername());
            System.out.println("lognput==>");

            System.out.println(lognput.getUsername());
            System.out.println(lognput.getPassword());
            if(lognput.getPassword().equals(userL.getPassword())  && lognput.getUsername().equals(userL.getUsername()))
            {
                System.out.println("in3");
                RegistrationDto response = new RegistrationDto();
                response.setRegistrationDetails(registrationRepo.findById(userL.getUsername())
                        .orElseThrow(()->new UserNotFoundException("User not found by the id:"+userL.getUsername())));
                response.setStatusMsg("Success");
                return  response;
            } else{
                System.out.println("inelse");
                RegistrationDto  user = new RegistrationDto();
                user.setStatusMsg( "User not found by the user name:"+userL.username);
                return user;
            }
        }

        else{
            RegistrationDto  user = new RegistrationDto();
            user.setStatusMsg( "User not found by the user name:"+userL.username);
            return user;
        }
    }





}
