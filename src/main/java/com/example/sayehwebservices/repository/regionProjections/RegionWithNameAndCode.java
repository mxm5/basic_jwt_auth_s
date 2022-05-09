package com.example.sayehwebservices.repository.regionProjections;

import lombok.Data;
import lombok.ToString;


public interface RegionWithNameAndCode {
    String getProvinceName();
    String getProvinceCode();
}
