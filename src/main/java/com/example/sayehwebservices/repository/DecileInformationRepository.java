package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.DecileInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface DecileInformationRepository extends JpaRepository<DecileInfo, String> {

    @Query(value = "select * from VW_NEWYARANEH where RES_SSN =:resSsn and ROWNUM=1",nativeQuery = true)
    Optional<DecileInfo> findFirstByResSsn(@Param("resSsn") String resSsn);

}
