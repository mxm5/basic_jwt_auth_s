package com.example.sayehwebservices.domain;

import lombok.ToString;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "VW_VARIZ", schema = "SAYEH", catalog = "")
@IdClass(SettledDepositPk.class)
public class SettledDeposit {
    @Id
    @Basic
    @Column(name = "TRANSDATE", nullable = true)
    private Date transdate;
    @Id
    @Basic
    @Column(name = "RES_SSN", nullable = true, length = 20)
    private String resSsn;
    @Basic
    @Column(name = "F03_AMOUNT", nullable = true, precision = 0)
    private BigInteger f03Amount;

    @Override
    public String toString() {
        return "SettledDeposit{" +
                "transdate=" + transdate +
                ", resSsn='" + resSsn + '\'' +
                ", f03Amount=" + f03Amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SettledDeposit that = (SettledDeposit) o;
        return Objects.equals(transdate, that.transdate) && Objects.equals(resSsn, that.resSsn) && Objects.equals(f03Amount, that.f03Amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transdate, resSsn, f03Amount);
    }
}
