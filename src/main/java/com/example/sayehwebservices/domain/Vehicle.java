package com.example.sayehwebservices.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "TB_VEHICLE", schema = "SAYEH", catalog = "")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    @Id
    @Basic
    @Column(name = "F01_NATIONAL_CODE", nullable = false, length = 20)
    private String f01NationalCode;
    @Basic
    @Column(name = "F02_VEHICLE_NAME", nullable = true, length = 20)
    private String f02VehicleName;
    @Basic
    @Column(name = "F03_VEHICLE_MODEL", nullable = true, length = 20)
    private String  f03VehicleModel;
    @Basic
    @Column(name = "F04_VEHICLE_YEAR", nullable = true)
    private Date f04VehicleYear;
    @Basic
    @Column(name = "F05_VEHICLE_COST", nullable = true, precision = 0)
    private Long f05VehicleCost;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(f01NationalCode, vehicle.f01NationalCode) && Objects.equals(f02VehicleName, vehicle.f02VehicleName) && Objects.equals(f03VehicleModel, vehicle.f03VehicleModel) && Objects.equals(f04VehicleYear, vehicle.f04VehicleYear) && Objects.equals(f05VehicleCost, vehicle.f05VehicleCost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(f01NationalCode, f02VehicleName, f03VehicleModel, f04VehicleYear, f05VehicleCost);
    }
}
