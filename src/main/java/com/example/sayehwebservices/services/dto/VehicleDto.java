package com.example.sayehwebservices.services.dto;

import com.github.mfathi91.time.PersianDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDto {
//    private String carTag;
    private String  vehicleName;
    private String  vehicleModel;
    private int vehicleYear;
    private Long vehicleCost;
}
