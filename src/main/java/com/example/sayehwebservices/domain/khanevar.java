package com.example.sayehwebservices.domain;

import lombok.*;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "VW_REFAH_KHANEVAR")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class khanevar {

    @Basic
    @Column(name = "RES_SSN", nullable = true, length = 20)
    private String resSsn;
    @Id
    @Basic
    @Column(name = "SSN", nullable = true, length = 20)
    private String ssn;
    @Basic
    @Column(name = "FIRSTNAME", nullable = true, length = 200)
    private String firstname;
    @Basic
    @Column(name = "LASTNAME", nullable = true, length = 200)
    private String lastname;
    @Basic
    @Column(name = "FATHERNAME", nullable = true, length = 200)
    private String fathername;
    @Basic
    @Column(name = "SHAMSIBIRTHDATE", nullable = true, length = 20)
    private String shamsibirthdate;
    @Basic
    @Column(name = "LOC", nullable = true, length = 10)
    private String loc;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        khanevar khanevar = (khanevar) o;
        return Objects.equals(ssn, khanevar.ssn) && Objects.equals(firstname, khanevar.firstname) && Objects.equals(lastname, khanevar.lastname) && Objects.equals(fathername, khanevar.fathername) && Objects.equals(shamsibirthdate, khanevar.shamsibirthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn, firstname, lastname, fathername, shamsibirthdate);
    }

    @Override
    public String toString() {
        return "khanevar{" +
                "resSsn='" + resSsn + '\'' +
                ", ssn='" + ssn + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", fathername='" + fathername + '\'' +
                ", shamsibirthdate='" + shamsibirthdate + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
