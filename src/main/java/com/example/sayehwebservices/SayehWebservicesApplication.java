package com.example.sayehwebservices;

import com.example.sayehwebservices.domain.Merchant;
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

@SpringBootApplication
public class SayehWebservicesApplication  {

    public static void main(String[] args) {
        SpringApplication.run(SayehWebservicesApplication.class, args);
    }


}
