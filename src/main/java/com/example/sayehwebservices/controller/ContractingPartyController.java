package com.example.sayehwebservices.controller;

import com.example.sayehwebservices.services.ContractingPartyService;
import com.example.sayehwebservices.services.dto.RemainingCreditRequest;
import com.example.sayehwebservices.services.dto.RemainingCreditResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ContractingPartyController {


    final ContractingPartyService contractingPartyService;

//    @PostMapping("/list-contract-parties-by-province")
//    ContractPartyListResponce getByProvince(@RequestBody ContractorByProvinceRequest request) {
//        return contractingPartyService.getByProvince(request);
//    }
//
//    @PostMapping("/list-contract-parties-by-city")
//    ContractPartyListResponce getByCity(@RequestBody ContractorByCityRequest request) {
//        return contractingPartyService.getByCity(request);
//    }
//
//    @PostMapping("/list-contract-parties-by-county")
//    ContractPartyListResponce getByCounty(@RequestBody ContractorByCountyRequest request) {
//        return contractingPartyService.getByCounty(request);
//    }

}
