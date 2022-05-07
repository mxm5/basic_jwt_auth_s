package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.khanevar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface KhanevarRepository extends JpaRepository<khanevar, String> {
    List<khanevar> findByResSsn(String resSsn);

    @Query(value = "select * from TB_KHANEVAR where RES_SSN =:resSsn",nativeQuery = true)
    List<khanevar> findByResSsnNativeQuery(@Param("resSsn") String resSsn);
}
