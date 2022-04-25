package com.example.sayehwebservices.domain;


import java.io.Serializable;
import java.util.Objects;

public class MerchantCompositeKey implements Serializable {
    private String merCode;
    private String merTerm;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MerchantCompositeKey that = (MerchantCompositeKey) o;
        return Objects.equals(merCode, that.merCode) && Objects.equals(merTerm, that.merTerm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(merCode, merTerm);
    }
}
