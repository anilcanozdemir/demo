package com.example.DTOs.Company.Request;


import com.example.AOP.Annotations.CompanyNameMustBeUnique;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CompanyAddedDto {

    @NotNull(message = "CompanyName can not be empty")
    @NotBlank(message = "CompanyName can not be blank.")
    @CompanyNameMustBeUnique
    private String name;


}
