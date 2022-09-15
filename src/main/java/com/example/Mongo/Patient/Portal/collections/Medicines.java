package com.example.Mongo.Patient.Portal.collections;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "Medicines")

public class Medicines {


    public String ApplNo;
    public String ProductNo;
    public String Form;
    public String Strength;
    public String ReferenceDrug;
    public String DrugName;
    public String ActiveIngredient;
    public String ReferenceStandard;
}
