package com.example.Mongo.Patient.Portal.dto;

import com.example.Mongo.Patient.Portal.collections.RegistrationDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDto {
    private RegistrationDetails registrationDetails;
    private String statusMsg;
}
