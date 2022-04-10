package com.example.sayehwebservices.domain;


import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "privileges")
public class Privilege implements GrantedAuthority {
    ////////////////////////////////////////
    // id
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description")
    private String description;


    @Override
    public String getAuthority() {
        return name;
    }
}
