package com.example.sayehwebservices.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "VW_CAR", schema = "SAYEH", catalog = "") // اطلاعات خودرو ها
public class CarInformation {
    @Basic
    @Column(name = "RES_SSN", nullable = true, length = 10)
    private String resSsn; // کد ملی سرپرست
    @Id
    @Basic
    @Column(name = "OWNER_SSN", nullable = true, length = 10)
    private String ownerSsn; // کد ملی مالک
    @Basic
    @Column(name = "FIRSTNAME", nullable = true, length = 100)
    private String firstname; // نام
    @Basic
    @Column(name = "LASTNAME", nullable = true, length = 100)
    private String lastname; // نام خانوادگی
    @Basic
    @Column(name = "CARTYPE", nullable = true, length = 50)
    private String cartype; // نوع خودرو
    @Basic
    @Column(name = "CARCATEGORY", nullable = true, length = 100)
    private String carcategory; // دسته بندی خودرو
    @Basic
    @Column(name = "IDN", nullable = true, length = 20)
    private String idn; // پلاک
    @Basic
    @Column(name = "MANYEAR", nullable = true, precision = 0)
    private Short manyear; // سال تولید

}
