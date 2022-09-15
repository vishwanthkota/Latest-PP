package com.example.Mongo.Patient.Portal.collections;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Immunization")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Immunization {
    @Id
    public int patientId;
    public String vaccine;
    public String vaccinateddate;
    public String noofdozes;
}
