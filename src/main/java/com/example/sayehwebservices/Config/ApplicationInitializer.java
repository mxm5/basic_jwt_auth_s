package com.example.sayehwebservices.Config;

import com.example.sayehwebservices.domain.Users;
import com.example.sayehwebservices.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


import java.sql.Date;
import java.time.LocalDate;
import java.util.HashSet;


@Component
@RequiredArgsConstructor
@Slf4j
class ApplicationInitializer implements ApplicationListener<ContextRefreshedEvent> {


    private final UsersRepository userRepository;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (userRepository.findByUserName("mmm") == null) {
            log.info("could not find user creating the user");
            Users mmmUser = new Users(
                    1L,
                    "$2a$10$PfL7BIX1Mj/F0ZBcjBhYpeal8S.GSRC9S/Nk8jEZKvCRbgptsKqRO",// bcrypt(123456789)
                    "mm@mm.gmail.com",
                    "mmm",
                    "moahammd",
                    "mohammadian",
                    Date.valueOf(LocalDate.now()),
                    new HashSet<>(),
                    "123456789"
            );

            userRepository.save(mmmUser);
        }


    }


}
