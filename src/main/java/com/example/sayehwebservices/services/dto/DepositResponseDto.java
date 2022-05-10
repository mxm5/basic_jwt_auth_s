package com.example.sayehwebservices.services.dto;

import com.example.sayehwebservices.domain.SettledDeposit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Objects;


public class DepositResponseDto {
    List<SettledDeposit> deposits;
    int total;

    public List<SettledDeposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(List<SettledDeposit> deposits) {
        this.deposits = deposits;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public DepositResponseDto(List<SettledDeposit> deposits, int total) {
        this.deposits = deposits;
        this.total = total;
    }

    @Override
    public String toString() {
        return "DepositResponseDto{" +
                "deposits=" + deposits +
                ", total=" + total +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepositResponseDto that = (DepositResponseDto) o;
        return total == that.total && Objects.equals(deposits, that.deposits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deposits, total);
    }
}
