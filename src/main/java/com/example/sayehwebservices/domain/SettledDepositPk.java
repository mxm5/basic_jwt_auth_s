package com.example.sayehwebservices.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Setter
@Getter
@NoArgsConstructor
public class SettledDepositPk implements Serializable {
    @Id
    @Column(name = "TRANSDATE", nullable = true)
    private Date transdate;
    @Id
    @Column(name = "RES_SSN", nullable = true, length = 20)
    private String resSsn;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SettledDepositPk that = (SettledDepositPk) o;
        return Objects.equals(transdate, that.transdate) && Objects.equals(resSsn, that.resSsn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transdate, resSsn);
    }
}
