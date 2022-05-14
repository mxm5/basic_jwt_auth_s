package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.SSNStat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SSNSStatRepository extends JpaRepository<SSNStat, String> {

    @Query(value = "select * from VW_REFAH_SSNSTAT where SSN = :nationalCode and ROWNUM = 1", nativeQuery = true)
    SSNStat getStatusByNationalCode(@Param("nationalCode") String nationalCode);
}
