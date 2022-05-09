package com.example.sayehwebservices.services;

import com.example.sayehwebservices.domain.Region;
import com.example.sayehwebservices.repository.RegionRepository;
import com.example.sayehwebservices.services.dto.CityResponseDto;
import com.example.sayehwebservices.services.dto.ProvinceResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RegionService {

    final RegionRepository regionRepository;

    public List<ProvinceResponseDto> getAllProvinces() {
        return regionRepository.getAllProvince();
    }

    public List<CityResponseDto> getAllCitiesForProvince(String provinceCode) {
        return regionRepository.getCitiesForProvince(provinceCode);
    }
}
