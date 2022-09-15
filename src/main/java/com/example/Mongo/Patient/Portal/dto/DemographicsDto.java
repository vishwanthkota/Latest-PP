package com.example.Mongo.Patient.Portal.dto;

import com.example.Mongo.Patient.Portal.collections.Demographics;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Demographics")

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DemographicsDto {
    @Id
    public String  patientId;
    public Demographics demographics;
}
