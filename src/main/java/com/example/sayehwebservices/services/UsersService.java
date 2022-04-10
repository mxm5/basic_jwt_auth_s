package com.example.sayehwebservices.services;

import com.example.sayehwebservices.domain.RegistrationResponseDto;
import com.example.sayehwebservices.domain.RegistrationRequestDto;
import com.example.sayehwebservices.domain.Users;
import com.example.sayehwebservices.repository.UsersRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

@Service
@AllArgsConstructor
@Slf4j
public class UsersService implements UserDetailsService {

    UsersRepository userRepository;

    public Users findBySub(String subject) {
        return userRepository.findByUserSubject(subject);
    }


    public RegistrationResponseDto register(RegistrationRequestDto dto) {

        Users user = new Users(
                new BCryptPasswordEncoder().encode(dto.getPassword()),
                dto.getEmail(),
                dto.getUserName(),
                dto.getFirstName(),
                dto.getLastName(),
                Date.valueOf(LocalDate.now()),
                dto.getRoleses(),
                UUID.randomUUID().toString()
        );
        Users save = userRepository.save(user);
//        System.out.println(save.getPassword());
        log.info("saved password was "+save.getPassword()); // this getter is overridden by null
        log.info("saved user was "+save);
        return new RegistrationResponseDto(save, dto.getSenderIp(), dto.getPassword());


    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUserName(username);
    }


}
