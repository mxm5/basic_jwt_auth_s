package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {


    Users findByUserName(String username);

    Users findByUserSubject(String userSubject);


}
