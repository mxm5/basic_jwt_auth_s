package com.example.sayehwebservices;

import com.example.sayehwebservices.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SayehWebservicesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SayehWebservicesApplication.class, args);
    }

    @Autowired
    UsersRepository usersRepository;


    @Override
    public void run(String... args) throws Exception {
        usersRepository.findAll().forEach(System.out::println);

    }
}
