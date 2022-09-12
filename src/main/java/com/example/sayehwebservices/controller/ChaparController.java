package com.example.sayehwebservices.controller;

import com.example.sayehwebservices.services.ChaparService;
import com.example.sayehwebservices.services.dto.ChaparReqDto;
import com.example.sayehwebservices.services.dto.ChaparResponseDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/v1/chapar")
@AllArgsConstructor
@Slf4j
public class ChaparController {

    @Autowired
    ChaparService chaparService;

    @CrossOrigin
    @PostMapping("/insecure")
    ChaparResponseDto chaparInsecure(
            @RequestBody ChaparReqDto chaparReqDto
    ) {
        return chaparService.getChaparFor(chaparReqDto);
    }


    @CrossOrigin
    @PostMapping("/secured")
    ChaparResponseDto chaparSecure(
            @RequestBody ChaparReqDto chaparReqDto
    ) {
        return chaparService.getChaparFor(chaparReqDto);
    }
}