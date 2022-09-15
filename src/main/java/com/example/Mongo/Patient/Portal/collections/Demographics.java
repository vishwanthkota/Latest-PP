package com.example.Mongo.Patient.Portal.collections;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
//@Document(collection = "Demographics")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Demographics {


    public String username;
    public String height;
    public String weight;
    public String bloodPressure;
    public String pluseRate;
    public String ethnicity;
    public String education;
    public String employment;
    public String address;
    public String phoneNo;
    public String medHistory;
    public String surgeries;
    public String gender;
    public String familyMedHistory;
    public String dob;
    public String notes;
    public String schedule_time;
    public String provider;
    public String type;


}
