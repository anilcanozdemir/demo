package com.example.DTOs.Flight.Request;

import com.example.Entity.Company;
import com.example.Enums.FlyType;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlightUpdateDto {

    private int capacity;


    private Long companyId;

    private Long id;

    private FlyType flyType;
    private double price;

    private double businessExtra;

    private int businessCapacity;
}
