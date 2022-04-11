package com.example.sayehwebservices.repository;

import com.example.sayehwebservices.domain.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {

//    Set<Transaction> findByF04Localdatefull(Date f04Localdatefull);

//    Page<History> histories = historyRepository.findByUserAndOrgan(user.getId(), requestDto.getOrganizationId(), PageRequest.of(requestDto.getPage(), requestDto.getSize()));

//    @Query("select t from History t where t.transportation.user.id = :userId and (:organizationId is null or (t.transportation.sourceOrganization.id= :organizationId))")
//    Page<History> findByDateRange(@Param("userId") Long userId, @Param("organizationId") Long organizationId, Pageable of);

    @Query("select t from Transaction t where t.f05TxLocaldat between :start and :end")
    Page<Transaction> findTransactionsPagedByTwoDateRanges(@Param("start") Date start, @Param("end") Date end , Pageable of);

    // finds a duplicate transaction with the transaction unique reference number and unique
    boolean existsTransactionByF04TraceRefNo12AndF03TraceNo(String f04TraceRefNo12, String f03TraceNo);

    List<Transaction> findByF16RecordCreationDate(Date f16RecordCreationDate);



}
