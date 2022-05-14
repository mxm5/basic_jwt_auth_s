package com.example.sayehwebservices.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "VW_REFAH_SSNSTAT", schema = "SAYEH", catalog = "")
@ToString
public class SSNStat {
    @Id
    @Basic
    @Column(name = "SSN", nullable = true, length = 10)
    private String ssn;
    @Basic
    @Column(name = "SSN_STAT", nullable = true, precision = 0)
    private int ssnStat;
    @Basic
    @Column(name = "DECILE", nullable = true, precision = 0)
    private int decile;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SSNStat that = (SSNStat) o;
        return Objects.equals(ssn, that.ssn) && Objects.equals(ssnStat, that.ssnStat) && Objects.equals(decile, that.decile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn, ssnStat, decile);
    }
}
