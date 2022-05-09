package com.example.sayehwebservices.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "BT_CITY", schema = "SAYEH", catalog = "")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Region {





    @Basic
    @Column(name = "CITY_CODE_N", nullable = false, precision = 0)
    private int cityCodeN;
    @Basic
    @Column(name = "PROVINCE_CODE_N", nullable = true, precision = 0)
    private Integer provinceCodeN;
    @Basic
    @Column(name = "PROVINCE_NAME", nullable = true, length = 255)
    private String provinceName;
    @Basic
    @Column(name = "COUNTY_CODE", nullable = true, length = 2)
    private String countyCode;
    @Basic
    @Column(name = "COUNTY_NAME", nullable = true, length = 255)
    private String countyName;
    @Basic
    @Column(name = "DISTRICT_CODE", nullable = true, length = 2)
    private String districtCode;
    @Basic
    @Column(name = "DISTRICT_NAME", nullable = true, length = 255)
    private String districtName;
    @Basic
    @Column(name = "CITY_IDEN", nullable = true, length = 4)
    private String cityIden;
    @Basic
    @Column(name = "CITY_NAME", nullable = true, length = 510)
    private String cityName;
    @Basic
    @Column(name = "PROVINCE_CODE", nullable = true, length = 2)
    private String provinceCode;
    @Basic
    @Column(name = "CHRONOLOGICAL_PPCC", nullable = true, length = 4)
    private String chronologicalPpcc;
    @Basic
    @Column(name = "CHRONOLOGICAL_PPCCDD", nullable = true, length = 6)
    private String chronologicalPpccdd;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CITY_CODE", nullable = false, length = 10)
    private String cityCode;
    @Basic
    @Column(name = "SORT_CODE", nullable = true, precision = 0)
    private Integer sortCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(cityCode, region.cityCode);
    }

    @Override
    public String toString() {
        return "Region{" +
                "cityCodeN=" + cityCodeN +
                ", provinceCodeN=" + provinceCodeN +
                ", provinceName='" + provinceName + '\'' +
                ", countyCode='" + countyCode + '\'' +
                ", countyName='" + countyName + '\'' +
                ", districtCode='" + districtCode + '\'' +
                ", districtName='" + districtName + '\'' +
                ", cityIden='" + cityIden + '\'' +
                ", cityName='" + cityName + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", chronologicalPpcc='" + chronologicalPpcc + '\'' +
                ", chronologicalPpccdd='" + chronologicalPpccdd + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", sortCode=" + sortCode +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityCode);
    }
}
