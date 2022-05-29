package com.example.sayehwebservices.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "VW_CV_REGINFO", schema = "SAYEH", catalog = "")
public class RegisteredPublicProfile {
    @Id
    @Basic
    @Column(name = "NATIONALCODE", nullable = true, length = 10)
    private String nationalcode;
    @Basic
    @Column(name = "FIRSTNAME", nullable = true, length = 50)
    private String firstname;
    @Basic
    @Column(name = "LASTNAME", nullable = true, length = 50)
    private String lastname;
    @Basic
    @Column(name = "FATHERNAME", nullable = true, length = 50)
    private String fathername;
    @Basic
    @Column(name = "BIRTHDATE", nullable = true, length = 50)
    private String birthdate;
    @Basic
    @Column(name = "GENDERID", nullable = true, length = 50)
    private String genderid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegisteredPublicProfile that = (RegisteredPublicProfile) o;
        return Objects.equals(nationalcode, that.nationalcode) && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(fathername, that.fathername) && Objects.equals(birthdate, that.birthdate) && Objects.equals(genderid, that.genderid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nationalcode, firstname, lastname, fathername, birthdate, genderid);
    }
}
