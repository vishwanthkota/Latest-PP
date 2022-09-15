package com.example.Mongo.Patient.Portal.collections;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "Tickets")
public class Tickets {

    @Id
    public int physicianId;
    public String username;
    public String raisedDate;
    public String title;
    public String body;
    public String uname;
    public String status;
}
