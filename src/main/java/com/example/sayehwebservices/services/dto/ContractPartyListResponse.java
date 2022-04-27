package com.example.sayehwebservices.services.dto;

import com.example.sayehwebservices.domain.Merchant;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.Collection;
import java.util.List;

@Data
public class ContractPartyListResponse {

    List<Merchant> listOfContractorMerchants;
    int total;

    public ContractPartyListResponse(Page<Merchant> byMerProvinceCode) {
        listOfContractorMerchants = byMerProvinceCode.getContent();
        total = byMerProvinceCode.getContent().size();
    }
}
