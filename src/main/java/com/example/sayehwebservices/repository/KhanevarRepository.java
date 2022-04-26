package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.khanevar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface KhanevarRepository extends JpaRepository<khanevar, String> {
    List<khanevar> findByResSsn(String resSsn);
}
