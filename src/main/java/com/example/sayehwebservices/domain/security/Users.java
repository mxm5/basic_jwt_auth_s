package com.example.sayehwebservices.domain.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.sql.Date;
import java.util.*;

@Entity
@Table(name = "SAYEH_USERS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users implements UserDetails {



    public Users(String password,
                 String email,
                 String userName,
                 String firstName,
                 String lastName,
                 Date creationDate,
                 Set<Roles> roleses,
                 String userSubject
    ) {
        this.password = password;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creationDate = creationDate;
        this.roleses = roleses;
        this.userSubject = userSubject;
    }

    ////////////////////////////////////////
    // id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    ////////////////////////////////////////
    // password
    @NotBlank(message = "password cant be blank")
    @NotEmpty(message = "password cant be empty")
//    @Max(message = "must be shorter than 255 characters ", value = 255)
//    @Min(message = " must be at minimum 6 characters", value = 6)
    @Column(name = "password", nullable = false)
    private String password;
    ////////////////////////////////////////
    // email
    @Column(name = "email")
    @Email(message = "email should be valid")
    @NotEmpty(message = "email should not be empty")
    @NotBlank(message = "email should not be blank")
    private String email;
    ////////////////////////////////////////
    // username
    @Column(name = "user_name", unique = true)
    @NotEmpty(message = "userName should not be empty")
    @NotBlank(message = "userName should not be blank")
    private String userName;
    ////////////////////////////////////////
    // first name
    @Column(name = "first_name")
    private String firstName;
    ////////////////////////////////////////
    // last name
    @Column(name = "last_name")
    private String lastName;
    ////////////////////////////////////////
    // creation date
    @Column(name = "creation_date")
    private Date creationDate;
    ////////////////////////////////////////
    // roles privileges
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "sayeh_users_roleses",
            joinColumns = @JoinColumn(name = "users_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "roleses_id", referencedColumnName = "id"))
    private Set<Roles> roleses = new LinkedHashSet<>();
    ////////////////////////////////////////
    @Column(name = "user_subject", nullable = false, unique = true)
    private String userSubject;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    ////////////////////////////////////////
    // to String


    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", creationDate=" + creationDate +
                ", userSubject='" + userSubject + '\'' +
                '}';
    }

    ////////////////////////////////////////
    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id.equals(users.id);
    }

    ////////////////////////////////////////
    // hashcode
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
