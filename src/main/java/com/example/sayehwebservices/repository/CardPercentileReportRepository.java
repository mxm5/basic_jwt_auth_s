package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.CardPercentileReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardPercentileReportRepository extends JpaRepository<CardPercentileReport,String> {
    List<CardPercentileReport> findByResSsn(String resSsn);
}
