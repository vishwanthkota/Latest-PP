package com.example.Mongo.Patient.Portal.collections;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "DiagCodes")
public class DiagCodes {

    public String Dcode;
    public String Description;
}
