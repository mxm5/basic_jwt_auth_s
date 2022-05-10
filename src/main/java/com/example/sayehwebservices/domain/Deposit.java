package com.example.sayehwebservices.domain;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "VW_SETTLED_DEPOSIT", schema = "SAYEH", catalog = "")
public class Deposit {


    @Id
    @Column(name = "TRANSDATE", nullable = true)
    private Date transdate;

    @Column(name = "RES_SSN", nullable = true, length = 20)
    private String resSsn;

    @Column(name = "F03_AMOUNT", nullable = true, precision = 0)
    private BigInteger f03Amount;

    public Date getTransdate() {
        return transdate;
    }

    public void setTransdate(Date transdate) {
        this.transdate = transdate;
    }

    public String getResSsn() {
        return resSsn;
    }

    public void setResSsn(String resSsn) {
        this.resSsn = resSsn;
    }

    public BigInteger getF03Amount() {
        return f03Amount;
    }

    public void setF03Amount(BigInteger f03Amount) {
        this.f03Amount = f03Amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deposit that = (Deposit) o;

        if (!Objects.equals(transdate, that.transdate)) return false;
        if (!Objects.equals(resSsn, that.resSsn)) return false;
        if (!Objects.equals(f03Amount, that.f03Amount)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = transdate != null ? transdate.hashCode() : 0;
        result = 31 * result + (resSsn != null ? resSsn.hashCode() : 0);
        result = 31 * result + (f03Amount != null ? f03Amount.hashCode() : 0);
        return result;
    }
}
