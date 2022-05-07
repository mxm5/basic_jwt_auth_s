package com.example.sayehwebservices;

import com.example.sayehwebservices.domain.Merchant;
import com.example.sayehwebservices.domain.khanevar;
import com.example.sayehwebservices.repository.KhanevarRepository;
import com.example.sayehwebservices.repository.MerchantRepository;
import com.example.sayehwebservices.repository.UsersRepository;
import com.example.sayehwebservices.services.KhanevarService;
import com.example.sayehwebservices.services.dto.FamilyMembersRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@SpringBootApplication
public class SayehWebservicesApplication /*implements CommandLineRunner*/ {

    public static void main(String[] args) {
        SpringApplication.run(SayehWebservicesApplication.class, args);
    }

//    @Autowired
//    UsersRepository usersRepository;
//
//    @Autowired
//    MerchantRepository merchantRepository;
//
//    @Autowired
//    KhanevarRepository khanevarRepository;
//
//    @Autowired
//    KhanevarService khanevarService;
//
//    @Override
//    public void run(String... args) throws Exception {
//        //  2529576092   has 6 members
//        Pageable page=PageRequest.of(0,10);
//        FamilyMembersRes familyMembersByParentNationalCode = khanevarService.getFamilyMembersByParentNationalCode("2529576092");
//        familyMembersByParentNationalCode.getFamilyMembers().forEach(System.out::println);
//    }
}
