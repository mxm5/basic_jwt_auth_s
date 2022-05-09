package com.example.sayehwebservices.services.dto;

import lombok.Data;

@Data
public class CityResponseDto {
    private String cityCode;
    private String cityName;


    public CityResponseDto(String cityCode, String cityName) {
        this.cityCode = cityCode;
        this.cityName = cityName;
    }
}
