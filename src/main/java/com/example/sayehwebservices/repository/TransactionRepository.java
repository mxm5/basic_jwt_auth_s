package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

//    Set<Transaction> findByF04Localdatefull(Date f04Localdatefull);

//    Page<History> histories = historyRepository.findByUserAndOrgan(user.getId(), requestDto.getOrganizationId(), PageRequest.of(requestDto.getPage(), requestDto.getSize()));

//    @Query("select t from History t where t.transportation.user.id = :userId and (:organizationId is null or (t.transportation.sourceOrganization.id= :organizationId))")
//    Page<History> findByDateRange(@Param("userId") Long userId, @Param("organizationId") Long organizationId, Pageable of);

    @Query("select t from Transaction t where t.f05TxLocaldat between :start and :end")
    Page<Transaction> findTransactionsPagedByTwoDateRanges(@Param("start") LocalDateTime start, @Param("end") LocalDateTime end, Pageable of);


    @Query("select t from Transaction t where (t.f05TxLocaldat between :start and :end) and t.f01Ncode = :nCode ")
    Page<Transaction> findTransactionsPagedByTwoDateRangesAndNationalCode(@Param("start") LocalDateTime start, @Param("end") LocalDateTime end, @Param("nCode") String nCode, Pageable of);

    // finds a duplicate transaction with the transaction unique reference number and unique
    boolean existsTransactionByF04TraceRefNo12AndF03TraceNo(String f04TraceRefNo12, String f03TraceNo);

    List<Transaction> findByF16RecordCreationDate(Date f16RecordCreationDate);

    Page<Transaction> findByF01NcodeAndF05TxLocaldatIsBetween(
            String f01Ncode, LocalDateTime start, LocalDateTime end, Pageable of);

    Page<Transaction> findByF05TxLocaldatBetweenAndF01NcodeIs(
            LocalDateTime start, LocalDateTime end, String f01Ncode, Pageable of);


    Page<Transaction> findByF05TxLocaldatIsBetweenAndF01Ncode(
            LocalDateTime start, LocalDateTime end, String f01Ncode, Pageable of);

    @Query(value = "select * from TB_TRANSACTIONS where (F05_TX_LOCALDAT between :start and :end)and F01_NCODE =:nCode"
//            ,countQuery = "select count(*) from TB_TRANSACTIONS"
            ,nativeQuery = true)
    List<Transaction> getTrue(
            @Param("start") LocalDateTime  start, @Param("end") LocalDateTime  end, @Param("nCode") String nCode/*,Pageable of*/);



//    @Query(value = "select * from TB_TRANSACTIONS where F05_TX_LOCALDAT between TO_DATE(:start ,'yyyy-mm-dd hh:mi:ss') and TO_DATE(:end ,'yyyy-mm-dd hh:mi:ss')"
////            ,countQuery = "select count(*) from TB_TRANSACTIONS"
//            ,nativeQuery = true)
//    List<Transaction> getTrue(
//            @Param("start") LocalDateTime  start, @Param("end") LocalDateTime  end);

//
    @Query(value = "select * from TB_TRANSACTIONS where F05_TX_LOCALDAT between :start  and :end and F01_NCODE =:nCode"
            ,countQuery = "select count(*) from TB_TRANSACTIONS"
            ,nativeQuery = true)
    Page<Transaction> getTrueB(
            @Param("start") LocalDateTime  start, @Param("end") LocalDateTime  end, @Param("nCode") String nCode,Pageable of);


    List<Transaction> findByF05TxLocaldatBetweenAndF01NcodeIs(LocalDateTime start, LocalDateTime end, String nCode);

}
