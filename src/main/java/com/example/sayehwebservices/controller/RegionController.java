package com.example.sayehwebservices.controller;

import com.example.sayehwebservices.services.RegionService;
import com.example.sayehwebservices.services.dto.NationalCodeRequest;
import com.example.sayehwebservices.services.dto.ProvinceResponseDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/region")
@AllArgsConstructor
@Slf4j
public class RegionController {
    @Autowired
    RegionService regionService;

    @GetMapping("/get-all-provinces")
    List<ProvinceResponseDto> getAllProvinces() {
        return regionService.getAllProvinces();
    }

}
