package com.example.Mongo.Patient.Portal.collections;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "ProCodes")
public class ProCodes {

    public String PCode;
    public String Description;
    public String PType;
}
