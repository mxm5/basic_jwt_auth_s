package com.example.sayehwebservices;

import com.example.sayehwebservices.domain.khanevar;
import com.example.sayehwebservices.repository.KhanevarRepository;
import com.example.sayehwebservices.repository.MerchantRepository;
import com.example.sayehwebservices.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Set;
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

    @Autowired
    KhanevarRepository khanevarRepository;

    @Override
    public void run(String... args) throws Exception {
//        2529576092   has 6 members
        List<khanevar> byResSsn = khanevarRepository.findByResSsn("2529576092");
        byResSsn.forEach(System.out::println);

    }
}
