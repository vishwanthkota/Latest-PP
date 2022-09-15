package com.vishwanth.Patient.Portal.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "userdetails")
@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
public class UserDetails implements Serializable {
    @Id
    private  String username;

    private String lastname;

    private String firstname;

    private String age;

    private String email;

    private String statusMsg;


}
