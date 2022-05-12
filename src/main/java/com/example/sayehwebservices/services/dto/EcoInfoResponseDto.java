package com.example.sayehwebservices.services.dto;

import com.example.sayehwebservices.domain.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EcoInfoResponseDto {
    private String deposits;
    private String incomes;
    private String purchase;
    private List<VehicleDto> vehicleList;
}
