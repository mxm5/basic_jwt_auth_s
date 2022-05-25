package com.example.sayehwebservices.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "VW_RAREDESEASES", schema = "SAYEH", catalog = "") // بیماری های خاص
public class RareDeceasesInfo {

    @Basic
    @Column(name = "RES_SSN", nullable = true, length = 10)
    private String resSsn; // کد ملی سرپرست
    @Id
    @Basic
    @Column(name = "SSN", nullable = true, length = 10)
    private String ssn; // کدملی شخص
    @Basic
    @Column(name = "FIRSTNAME", nullable = true, length = 100)
    private String firstname; // نام
    @Basic
    @Column(name = "LASTNAME", nullable = true, length = 100)
    private String lastname; // نام خانوادگی
    @Basic
    @Column(name = "DESEASESTYPE", nullable = true, precision = 0)
    private Boolean deseasestype ; // دارای بیماری خاص
    @Basic
    @Column(name = "DESEASESTITLE", nullable = true, length = 100)
    private String deseasestitle; // نام بیماری خاص
    @Basic
    @Column(name = "DESEASESREPORTSOURCE", nullable = true, length = 100)
    private String deseasesreportsource; // منبع گزارش بیماری خاص

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RareDeceasesInfo that = (RareDeceasesInfo) o;
        return Objects.equals(resSsn, that.resSsn) && Objects.equals(ssn, that.ssn) && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(deseasestype, that.deseasestype) && Objects.equals(deseasestitle, that.deseasestitle) && Objects.equals(deseasesreportsource, that.deseasesreportsource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resSsn, ssn, firstname, lastname, deseasestype, deseasestitle, deseasesreportsource);
    }
}
