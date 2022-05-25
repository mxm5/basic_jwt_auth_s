package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.RareDeceasesInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RareDeceaseInfoRepository extends JpaRepository<RareDeceasesInfo, String> {
    List<RareDeceasesInfo> findByResSsn(String resSsn);
}
