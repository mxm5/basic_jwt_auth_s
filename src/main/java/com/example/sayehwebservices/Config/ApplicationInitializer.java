package com.example.sayehwebservices.Config;

import com.example.sayehwebservices.domain.security.Roles;
import com.example.sayehwebservices.domain.security.Users;
import com.example.sayehwebservices.repository.RolesRepository;
import com.example.sayehwebservices.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;


import javax.transaction.Transactional;
import java.sql.Date;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;


@Component
@RequiredArgsConstructor
@Slf4j
class ApplicationInitializer implements ApplicationListener<ContextRefreshedEvent> {


    private final UsersRepository userRepository;
    private final RolesRepository rolesRepository;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        transientRoleUserAddin();


    }

    @Transactional
    public void transientRoleUserAddin() {
        if (userRepository.findByUserName("mmm") == null) {
            log.info("could not find user creating the user");
            Users mmmUser = new Users(
                    "$2a$10$acSEDlTWcSfRJODehRBkD.cl8HvgPAmcywEt6gm8JsFK0ZtfcM6GG",
                    "mm@mm.gmail.com",
                    "mmm",
                    "moahammd",
                    "mohammadian",
                    Date.valueOf(LocalDate.now()),
                    new HashSet<>(),
                    "123456789"
            );
            Set<Roles> rolesSe = new HashSet<>();
            Roles adminRole = new Roles();
            adminRole.setRoleDescription("this is user roles");
            adminRole.setRoleName("user");
            adminRole.setId(1L);
            rolesRepository.save(adminRole);
            rolesSe.add(adminRole);
            mmmUser.setRoleses(rolesSe);
            Users save = userRepository.save(mmmUser);
            save.getRoleses().forEach(System.out::println);
            save.getAuthorities().forEach(System.out::println);


        }
        if (userRepository.findByUserName("fff") == null) {
            log.info("could not find user creating the user");
            Users ftmUser = new Users(
                    "$2a$10$acSEDlTWcSfRJODehRBkD.cl8HvgPAmcywEt6gm8JsFK0ZtfcM6GG",
                    "fff@mm.gmail.com",
                    "fff",
                    "fatimah",
                    "mohammadi",
                    Date.valueOf(LocalDate.now()),
                    new HashSet<>(),
                    "12345678910"
            );
            Set<Roles> rolesSe = new HashSet<>();
            Roles adminRole = new Roles();
            adminRole.setRoleDescription("this is admin role");
            adminRole.setRoleName("admin");
            adminRole.setId(2L);
            Roles found =rolesRepository.save(adminRole);
            rolesSe.add(adminRole);
            ftmUser.setRoleses(rolesSe);
            Users save = userRepository.save(ftmUser);
            save.getRoleses().forEach(System.out::println);
            save.getAuthorities().forEach(System.out::println);

        }
    }


}