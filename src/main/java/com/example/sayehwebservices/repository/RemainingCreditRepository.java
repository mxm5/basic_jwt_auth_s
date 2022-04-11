package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.RemainingCredit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemainingCreditRepository extends JpaRepository<RemainingCredit, String> {
    RemainingCredit findByF01Ncode(String f01Ncode);
}
