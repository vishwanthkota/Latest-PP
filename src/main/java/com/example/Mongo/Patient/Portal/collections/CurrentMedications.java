package com.example.Mongo.Patient.Portal.collections;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CurrentMedications {
    @Id
    public int patientId;
    public String drugName;
    public String drugStrength;
    public String drugForm;
}
