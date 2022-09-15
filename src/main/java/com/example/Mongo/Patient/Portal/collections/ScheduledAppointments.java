package com.example.Mongo.Patient.Portal.collections;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "ScheduledAppointments")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ScheduledAppointments {
//    @Id
//    public int patientId;
    public String physicianName;
    public String dateAndTime;
    public String type;
}
