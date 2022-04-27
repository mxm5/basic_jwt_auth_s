package com.example.sayehwebservices.controller;

import com.example.sayehwebservices.services.ContractingPartyService;
import com.example.sayehwebservices.services.dto.ContractPartyListResponse;
import com.example.sayehwebservices.services.dto.ContractorByCityRequest;
import com.example.sayehwebservices.services.dto.ContractorByCountyRequest;
import com.example.sayehwebservices.services.dto.ContractorByProvinceRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/contracting-party")
@AllArgsConstructor
@Slf4j
public class ContractingPartyController {


    final ContractingPartyService contractingPartyService;

    @PostMapping("/list-contract-parties-by-province")
    ContractPartyListResponse getByProvince(@RequestBody ContractorByProvinceRequest request) throws Exception {
        System.out.println(request);
        return contractingPartyService.getByProvince(request);
    }

    @PostMapping("/list-contract-parties-by-city")
    ContractPartyListResponse getByCity(@RequestBody ContractorByCityRequest request) throws Exception {
        return contractingPartyService.getByCity(request);
    }

    @PostMapping("/list-contract-parties-by-county")
    ContractPartyListResponse getByCounty(@RequestBody ContractorByCountyRequest request) throws Exception{
        return contractingPartyService.getByCounty(request);
    }

}
