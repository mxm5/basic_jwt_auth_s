package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.security.Roles;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public interface RolesRepository extends JpaRepository<Roles,Long> {
    Roles findByRoleName( String roleName);
}
