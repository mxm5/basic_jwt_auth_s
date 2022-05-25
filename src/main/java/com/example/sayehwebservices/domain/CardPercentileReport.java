package com.example.sayehwebservices.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "VW_CARD_PERCENTILE", schema = "SAYEH", catalog = "") // گزارش صدک خرید های کارتی
public class CardPercentileReport {
    @Basic
    @Column(name = "RES_SSN", nullable = true, length = 10)
    private String resSsn; // کد ملی سرپرست
    @Id
    @Basic
    @Column(name = "SSN", nullable = true, length = 10)
    private String ssn; // کد ملی شخص
    @Basic
    @Column(name = "FIRSTNAME", nullable = true, length = 100)
    private String firstname; // نام
    @Basic
    @Column(name = "LASTNAME", nullable = true, length = 100)
    private String lastname; // نام خانوادگی
    @Basic
    @Column(name = "PERCENTILE", nullable = true, precision = 0)
    private Long percentile; // صدک
    @Basic
    @Column(name = "FROMAMOUNT", nullable = true, precision = 0)
    private Long fromamount; // ابتدای بازه صدک
    @Basic
    @Column(name = "TOAMOUNT", nullable = true, precision = 0)
    private Long toamount; // انتهای بازه صدک
    @Basic
    @Column(name = "PERIODTITLE", nullable = true, length = 100)
    private String periodtitle; // عنوان دوره زمانی

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardPercentileReport that = (CardPercentileReport) o;
        return Objects.equals(resSsn, that.resSsn) && Objects.equals(ssn, that.ssn) && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(percentile, that.percentile) && Objects.equals(fromamount, that.fromamount) && Objects.equals(toamount, that.toamount) && Objects.equals(periodtitle, that.periodtitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resSsn, ssn, firstname, lastname, percentile, fromamount, toamount, periodtitle);
    }
}
