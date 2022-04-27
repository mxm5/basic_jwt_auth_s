package com.example.sayehwebservices.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Setter
@Getter
@NoArgsConstructor
public class MerchantPK implements Serializable {
    @Column(name = "MER_CODE", nullable = false, length = 10)
    @Id
    private String merCode;
    @Column(name = "MER_TERM", nullable = false, length = 100)
    @Id
    private String merTerm;
    @Column(name = "MER_PSPCODE", nullable = false, length = 100)
    @Id
    private String merPspcode;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MerchantPK that = (MerchantPK) o;
        return Objects.equals(merCode, that.merCode) && Objects.equals(merTerm, that.merTerm) && Objects.equals(merPspcode, that.merPspcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(merCode, merTerm, merPspcode);
    }
}
