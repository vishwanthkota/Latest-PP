package com.example.Mongo.Patient.Portal.collections;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String address1;
    private String address2;
    private String city;
}
