package com.example.sayehwebservices.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "sayeh_roles")
public class Roles {
    ////////////////////////////////////////
    // id
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    ////////////////////////////////////////
    // name
    @Length(min = 4, max = 255)
    @NotBlank(message = "role name should not be blank")
    @NotEmpty(message = "role name should not be empty")
    @NotNull(message = "role name should not be null")
    @Column(name = "role_name", nullable = false, unique = true)
    private String roleName;
    ////////////////////////////////////////
    // description
    @Length(min = 4, max = 255)
    @NotBlank(message = "role Description should not be blank")
    @NotEmpty(message = "role Description should not be empty")
    @NotNull(message = "role Description should not be null")
    @Column(name = "role_Description")
    private String roleDescription;
    ////////////////////////////////////////
    // users
    @ManyToMany(mappedBy = "roleses")
    private List<Users> userses = new ArrayList<>();
    ////////////////////////////////////////
    // privileges
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "roles_privileges",
            joinColumns = @JoinColumn(name = "roles_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "privileges_id", referencedColumnName = "id"))
    private Set<Privilege> privileges = new LinkedHashSet<>();
    ////////////////////////////////////////

    @Override
    public String toString() {
        return "Roles{" +
                "roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                ", privileges=" + privileges +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Roles roles = (Roles) o;
        return id != null && Objects.equals(id, roles.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
