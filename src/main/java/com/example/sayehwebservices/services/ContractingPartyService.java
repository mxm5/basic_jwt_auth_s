package com.example.sayehwebservices.services;

import com.example.sayehwebservices.domain.Merchant;
import com.example.sayehwebservices.repository.MerchantRepository;
import com.example.sayehwebservices.services.dto.ContractPartyListResponse;
import com.example.sayehwebservices.services.dto.ContractorByCityRequest;
import com.example.sayehwebservices.services.dto.ContractorByCountyRequest;
import com.example.sayehwebservices.services.dto.ContractorByProvinceRequest;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContractingPartyService {

    final MerchantRepository merchantRepository;


    public ContractPartyListResponse getByProvince(ContractorByProvinceRequest request) throws Exception {
        Pageable page = PageRequest.of(request.getOffset(), request.getSize());
        if (request.getProvinceCode() != null && request.getProvinceName() == null) {

            Page<Merchant> byMerProvinceCode = merchantRepository.findByMerProvinceCode(request.getProvinceCode(), page);
            System.out.println(byMerProvinceCode.getContent().size());
            byMerProvinceCode.forEach(System.out::println);
            return new ContractPartyListResponse(byMerProvinceCode);
        } else if (request.getProvinceName() != null && request.getProvinceCode() == null) {

            Page<Merchant> byMerProvinceCode = merchantRepository.findByMerProvince(request.getProvinceName(), page);
            System.out.println(byMerProvinceCode.getContent().size());
            byMerProvinceCode.forEach(System.out::println);
            return new ContractPartyListResponse(byMerProvinceCode);
        } else if (request.getProvinceName() != null && request.getProvinceCode() != null) {
            throw new Exception("only one of fields province provinceCode or provinceName");
        } else {
            throw new Exception("empty fields error");
        }
    }

    public ContractPartyListResponse getByCity(ContractorByCityRequest request) throws Exception {
        Pageable page = PageRequest.of(request.getOffset(), request.getSize());
        if (request.getCityCode() != null && request.getCityName() == null) {
            /// finds the list of merchants by province code
            Page<Merchant> byMerProvinceCode = merchantRepository.findByMerCityCode(request.getCityCode(), page);
            System.out.println(byMerProvinceCode.getContent().size());
            byMerProvinceCode.forEach(System.out::println);
            return new ContractPartyListResponse(byMerProvinceCode);
        } else if (request.getCityName() != null && request.getCityCode() == null) {
            /// finds the list of merchants by province name
            Page<Merchant> byMerProvinceCode = merchantRepository.findByMerCity(request.getCityName(), page);
            System.out.println(byMerProvinceCode.getContent().size());
            byMerProvinceCode.forEach(System.out::println);
            return new ContractPartyListResponse(byMerProvinceCode);
        } else if (request.getCityName() != null && request.getCityCode() != null) {
            throw new Exception("only one of fields province CityName or CityCode");
        } else {
            throw new Exception("empty fields error");
        }

    }

    public ContractPartyListResponse getByCounty(ContractorByCountyRequest request) throws Exception {
        Pageable page = PageRequest.of(request.getOffset(), request.getSize());
        if (request.getCountyCode() != null && request.getCountyName() == null) {
            /// finds the list of merchants by province code
            Page<Merchant> byMerProvinceCode = merchantRepository.findByMerCountyCode(request.getCountyCode(), page);
            System.out.println(byMerProvinceCode.getContent().size());
            byMerProvinceCode.forEach(System.out::println);
            return new ContractPartyListResponse(byMerProvinceCode);
        } else if (request.getCountyName() != null && request.getCountyCode() == null) {
            /// finds the list of merchants by province name
            Page<Merchant> byMerProvinceCode = merchantRepository.findByMerCounty(request.getCountyName(), page);
            System.out.println(byMerProvinceCode.getContent().size());
            byMerProvinceCode.forEach(System.out::println);
            return new ContractPartyListResponse(byMerProvinceCode);
        } else if (request.getCountyName() != null && request.getCountyCode() != null) {
            throw new Exception("only one of fields province CountyName or CountyCode");
        } else {
            throw new Exception("empty fields error");
        }

    }
}
