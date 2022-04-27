package com.example.sayehwebservices.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "TB_MERCHANT_TERMINAL", schema = "SAYEH", catalog = "")
@IdClass(MerchantPK.class)
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Merchant {
    @Id
    @Column(name = "MER_CODE", nullable = false, length = 10)
    private String merCode;
    @Basic
    @Column(name = "MER_NAME", nullable = true, length = 100)
    private String merName;
    @Id
    @Column(name = "MER_TERM", nullable = false, length = 100)
    private String merTerm;
    @Basic
    @Column(name = "MER_PROVINCE_CODE", nullable = true, length = 100)
    private String merProvinceCode;
    @Basic
    @Column(name = "MER_PROVINCE", nullable = true, length = 100)
    private String merProvince;
    @Basic
    @Column(name = "MER_COUNTY_CODE", nullable = true, length = 100)
    private String merCountyCode;
    @Basic
    @Column(name = "MER_COUNTY", nullable = true, length = 100)
    private String merCounty;
    @Basic
    @Column(name = "MER_CITY_CODE", nullable = true, length = 100)
    private String merCityCode;
    @Basic
    @Column(name = "MER_CITY", nullable = true, length = 100)
    private String merCity;
    @Basic
    @Column(name = "MER_ADDRESS", nullable = true, length = 1000)
    private String merAddress;
    @Id
    @Column(name = "MER_PSPCODE", nullable = false, length = 100)
    private String merPspcode;
    @Basic
    @Column(name = "MER_PSP", nullable = true, length = 100)
    private String merPsp;
    @Basic
    @Column(name = "MER_CATEGORY_CODE", nullable = true, length = 10)
    private String merCategoryCode;
    @Basic
    @Column(name = "MER_CATEGORY", nullable = true, length = 100)
    private String merCategory;
    @Basic
    @Column(name = "MER_SUBCATEGORY_CODE", nullable = true, length = 10)
    private String merSubcategoryCode;
    @Basic
    @Column(name = "MER_SUBCATEGORY", nullable = true, length = 100)
    private String merSubcategory;
    @Basic
    @Column(name = "MER_LAT", nullable = true, precision = 0)
    private BigInteger merLat;
    @Basic
    @Column(name = "MER_LONG", nullable = true, precision = 0)
    private BigInteger merLong;
    @Basic
    @Column(name = "MER_MOBILE", nullable = true, length = 100)
    private String merMobile;
    @Basic
    @Column(name = "MER_TEL1", nullable = true, length = 100)
    private String merTel1;
    @Basic
    @Column(name = "MER_TEL2", nullable = true, length = 100)
    private String merTel2;
    @Basic
    @Column(name = "MER_TEL3", nullable = true, length = 100)
    private String merTel3;
    @Basic
    @Column(name = "MER_ECOCODE", nullable = true, length = 100)
    private String merEcocode;
    @Basic
    @Column(name = "MER_NCODE", nullable = true, length = 100)
    private String merNcode;
    @Basic
    @Column(name = "MER_FNAME", nullable = true, length = 100)
    private String merFname;
    @Basic
    @Column(name = "MER_LNAME", nullable = true, length = 100)
    private String merLname;
    @Basic
    @Column(name = "MER_BDATE", nullable = true, length = 100)
    private String merBdate;
    @Basic
    @Column(name = "MER_STARTDATE", nullable = true, length = 100)
    private String merStartdate;
    @Basic
    @Column(name = "MER_ENDDATE", nullable = true, length = 100)
    private String merEnddate;
    @Basic
    @Column(name = "MER_PROVUNCE", nullable = true, length = 100)
    private String merProvunce;
    @Basic
    @Column(name = "MER_PROVUNCE_CODE", nullable = true, length = 100)
    private String merProvunceCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Merchant merchant = (Merchant) o;
        return merCode.equals(merchant.merCode) && merTerm.equals(merchant.merTerm) && merPspcode.equals(merchant.merPspcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(merCode, merTerm, merPspcode);
    }
}
