package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.RegisteredPublicProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicProfileRepository extends JpaRepository<RegisteredPublicProfile, String> {
    RegisteredPublicProfile findByNationalcodeAndBirthdate(String nationalcode, String birthdate);
}
