package com.example.sayehwebservices.services;

import com.example.sayehwebservices.domain.Deposit;
import com.example.sayehwebservices.repository.DepositsRepository;
import com.example.sayehwebservices.services.dto.DepositReportRequest;
import com.example.sayehwebservices.services.dto.DepositResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepositService {


    @Autowired
    DepositsRepository depositsRepository;

    public DepositResponseDto getAllDeposits(DepositReportRequest request) throws Exception {
        PageRequest page = PageRequest.of(request.getOffset(), request.getSize());
//        check end date is before start date
        if (request.getStart().after(request.getEnd())) throw new Exception(" start should be before end");
        Page<Deposit> settledDepositsPage = depositsRepository.findByTransdateBetweenAndResSsnIs(request.getStart(), request.getEnd(), request.getNationalCode(), page);
        List<Deposit> content = settledDepositsPage.getContent();
        content.forEach(System.out::println);
        DepositResponseDto depositResponseDto = new DepositResponseDto(
                content,
                content.size()
        );
        System.out.println(depositResponseDto);
        return depositResponseDto;
    }
}
