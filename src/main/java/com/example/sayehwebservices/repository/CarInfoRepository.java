package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.CarInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarInfoRepository extends JpaRepository<CarInformation, String> {
    List<CarInformation> findByResSsn(String resSsn);
}
