package com.example.sayehwebservices.Config;

import com.example.sayehwebservices.domain.security.Roles;
import com.example.sayehwebservices.domain.security.Users;
import com.example.sayehwebservices.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


import java.sql.Date;
import java.time.LocalDate;
import java.util.HashSet;


@Component
@RequiredArgsConstructor
@Slf4j
@PropertySource(name = "sec.conf", value = "sec.conf.properties")
class ApplicationInitializer implements ApplicationListener<ContextRefreshedEvent> {


    private final UsersRepository userRepository;

   private String username ;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {


        if (userRepository.findByUserName(username) == null) {
            log.info("could not find user creating the user");

            String userEmail = "mm@mm.gmail.com";
            String hashedPassword = "$2a$10$acSEDlTWcSfRJODehRBkD.cl8HvgPAmcywEt6gm8JsFK0ZtfcM6GG";
            String firstName = "moahammd";
            String lastName = "mohammadian";
            Date creationDate = Date.valueOf(LocalDate.now());
            HashSet<Roles> roleses = new HashSet<>();
            String userSubject = "123456789";
            Users mmmUser = new Users(
                    hashedPassword,
                    userEmail,
                    username,
                    firstName,
                    lastName,
                    creationDate,
                    roleses,
                    userSubject
            );

            userRepository.save(mmmUser);
        }


    }


}
