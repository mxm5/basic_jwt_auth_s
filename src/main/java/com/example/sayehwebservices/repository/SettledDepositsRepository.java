package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.Merchant;
import com.example.sayehwebservices.domain.MerchantPK;
import com.example.sayehwebservices.domain.SettledDeposit;
import com.example.sayehwebservices.domain.SettledDepositPk;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDateTime;

@Repository
public interface SettledDepositsRepository extends JpaRepository<SettledDeposit, SettledDepositPk> {


    Page<SettledDeposit> findByTransdateBetweenAndResSsnIs(Date start, Date end, String resSsn, Pageable of);

//    Page<SettledDeposit> findByResSsnAndAndTransdateIsBetween(String resSsn,,,Pageable pageable);
    //
//    Page<Merchant> findByMerProvince(String merProvince, Pageable of);
//
//    Page<Merchant> findByMerProvinceCode(String merProvinceCode, Pageable of);
//
//    Page<Merchant> findByMerCity(String merCity, Pageable of);
//
//    Page<Merchant> findByMerCityCode(String merCityCode, Pageable of);
//
//    Page<Merchant> findByMerCounty(String merCounty, Pageable of);
//
//    //    Page<Merchant> findByMerCountyCode(String merCountyCode  , Pageable of);
//    Page<Merchant> findByMerCountyCode(String merCountyCode, Pageable of);

}
