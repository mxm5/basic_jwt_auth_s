package com.example.sayehwebservices.repository;


import com.example.sayehwebservices.domain.EarningReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EarningReportRepository extends JpaRepository<EarningReport, String> {
    List<EarningReport> findByResSsn(String resSsn);
}
