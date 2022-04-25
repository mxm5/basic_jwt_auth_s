package com.example.sayehwebservices;

import com.example.sayehwebservices.repository.MerchantRepository;
import com.example.sayehwebservices.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class SayehWebservicesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SayehWebservicesApplication.class, args);
    }

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    MerchantRepository merchantRepository;

    @Override
    public void run(String... args) throws Exception {
        merchantRepository.findAll().forEach(System.out::println);
        while (true) {
            TimeUnit.SECONDS.sleep(1);
            merchantRepository.findAll().forEach(System.out::println);

        }
    }
}
