package com.example.sayehwebservices.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "TB_REMAINCREDIT", schema = "SAYEH", catalog = "")
@Getter
@Setter
public class RemainingCredit {

    @Id
    @Column(name = "F01_NCODE", nullable = false, length = 20,unique = true)
    private String f01Ncode;
    @Basic
    @Column(name = "F02_CREDIT", nullable = true, precision = 0)
    private Long f02Credit;
    @Basic
    @Column(name = "F03_REMCREDIT", nullable = true, precision = 0)
    private Long f03Remcredit;
    @Column(name = "F04_LASTDATE")
    private LocalDateTime f04Lastdate;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RemainingCredit that = (RemainingCredit) o;
        return Objects.equals(f01Ncode, that.f01Ncode) && Objects.equals(f02Credit, that.f02Credit) && Objects.equals(f03Remcredit, that.f03Remcredit) && Objects.equals(f04Lastdate, that.f04Lastdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(f01Ncode, f02Credit, f03Remcredit, f04Lastdate);
    }
}
