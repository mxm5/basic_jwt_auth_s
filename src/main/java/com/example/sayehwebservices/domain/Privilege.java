package com.example.sayehwebservices.domain;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.*;

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

    @ManyToMany(mappedBy = "privileges")
    private List<Roles> roleses = new ArrayList<>();


    @Override
    public String getAuthority() {
        return name;
    }



    ////////////////////////////////////////
    // to String
    @Override
    public String toString() {
        return "Privilege{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Privilege privilege = (Privilege) o;
        return id != null && Objects.equals(id, privilege.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
