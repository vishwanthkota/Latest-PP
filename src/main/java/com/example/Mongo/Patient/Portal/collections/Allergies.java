package com.example.Mongo.Patient.Portal.collections;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "allergies")
public class Allergies {

    public int ID;
    public String allergyName;
    public String allergyType;
    public String allerginicity;
    public String allergenSource;
}
