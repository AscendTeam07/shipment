package com.wallmart.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "distance")
public class Distance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    public String id;
    public String zipcode;
    public String typeOfShipping;
    public double shippingCost;
    public int deliveryDuration;
}
