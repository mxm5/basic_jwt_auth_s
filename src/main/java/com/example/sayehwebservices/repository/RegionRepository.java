package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.Region;
import com.example.sayehwebservices.repository.regionProjections.RegionWithNameAndCode;
import com.example.sayehwebservices.services.dto.CityResponseDto;
import com.example.sayehwebservices.services.dto.ProvinceResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface RegionRepository extends JpaRepository<Region, String> {


    //    @Query(value = "select PROVINCE_CODE ,PROVINCE_NAME from BT_CITY group by PROVINCE_CODE,PROVINCE_NAME",nativeQuery = true)
    @Query(value = "select  r.provinceName ,r.provinceCode from Region r group by r.provinceName , r.provinceCode ")
//    @Query(value = "select new ProvinceResponseDto( r.provinceName ,r.provinceCode) from Region r group by r.provinceName , r.provinceCode ")
    //   <T> Collection<T> getAllOfProvincesWithCodeAndName(Class<T> tClass);
    Collection<RegionWithNameAndCode> getAllOfProvincesWithCodeAndName();

    //new com.foo.bar.entity.Document(d.docId, d.filename)
    @Query(value = "select r.provinceName ,r.provinceCode from Region r group by r.provinceName , r.provinceCode ")
    <T> Collection<T> getAllOfProvincesWithCodeAndName(Class<T> tClass);

    @Query(value = "select new com.example.sayehwebservices.services.dto.ProvinceResponseDto( r.provinceName ,r.provinceCode) from Region r group by r.provinceName , r.provinceCode ")
    List<ProvinceResponseDto> getAllProvince();

    @Query(value = "select distinct PROVINCE_CODE , PROVINCE_NAME from BT_CITY group by PROVINCE_CODE,PROVINCE_NAME", nativeQuery = true)
    List<Object[]> getAllProvinces();
    @Query(value = "select new com.example.sayehwebservices.services.dto.CityResponseDto( r.cityCode ,r.cityName) from Region r where r.provinceCode =:provinceCode")
    List<CityResponseDto> getCitiesForProvince( @Param("provinceCode") String provinceCode);


//    @Query(value = "select PROVINCE_CODE ,PROVINCE_NAME from BT_CITY group by PROVINCE_CODE,PROVINCE_NAME", nativeQuery = true)
//    List<Region> getAllProvinces2();

}
