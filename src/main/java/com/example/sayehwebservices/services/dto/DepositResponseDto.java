package com.example.sayehwebservices.services.dto;

import com.example.sayehwebservices.domain.Deposit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Objects;


public class DepositResponseDto {
    List<Deposit> deposits;
    int total;

    public List<Deposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(List<Deposit> deposits) {
        this.deposits = deposits;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public DepositResponseDto(List<Deposit> deposits, int total) {
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
