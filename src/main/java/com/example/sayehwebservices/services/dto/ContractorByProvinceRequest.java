package com.example.sayehwebservices.services.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class ContractorByProvinceRequest {
    String provinceCode;
    String provinceName;
    @NotNull
    @NotEmpty
    @NotBlank
    int offset;
    @NotNull
    @NotEmpty
    @NotBlank
    int size;
}
