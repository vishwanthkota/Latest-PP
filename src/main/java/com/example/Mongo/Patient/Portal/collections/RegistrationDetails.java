package com.example.Mongo.Patient.Portal.collections;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "RegistrationDetails")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class RegistrationDetails {
    @Id
    private  String username;
    public String patientId;
    private String lastname;

    private String firstname;

    private String email;

    private String password;

    private  String dob;

    private  String role;

    private  String phone;

    private  String isActive;

    private  String regDate;

    private List<ScheduledAppointments> scheduledAppointments;

    private  Demographics demographics;
}

