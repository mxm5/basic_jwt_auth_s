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
@Table(name = "VW_EARNING", schema = "SAYEH", catalog = "") // اطلاعات درآمدی
public class EarningReport {
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
    @Column(name = "FIXEDEARNINGAMOUNT", nullable = true, precision = 0)
    private Long fixedearningamount; // میزان درآمد ثابت
    @Basic
    @Column(name = "BANKPROFITAMOUNT", nullable = true, precision = 0)
    private Long bankprofitamount; // میزان سود بانکی
    @Basic
    @Column(name = "JOBTITLE", nullable = true, length = 100)
    private String jobtitle; // عنوان شغلی
    @Basic
    @Column(name = "INCOMEREPORTSOURCE", nullable = true, length = 100)
    private String incomereportsource; // منبع گزارش درآمدها

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EarningReport earningReport = (EarningReport) o;
        return Objects.equals(resSsn, earningReport.resSsn) && Objects.equals(ssn, earningReport.ssn) && Objects.equals(firstname, earningReport.firstname) && Objects.equals(lastname, earningReport.lastname) && Objects.equals(fixedearningamount, earningReport.fixedearningamount) && Objects.equals(bankprofitamount, earningReport.bankprofitamount) && Objects.equals(jobtitle, earningReport.jobtitle) && Objects.equals(incomereportsource, earningReport.incomereportsource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resSsn, ssn, firstname, lastname, fixedearningamount, bankprofitamount, jobtitle, incomereportsource);
    }
}
