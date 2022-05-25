package com.example.sayehwebservices.services.dto;

import com.example.sayehwebservices.domain.CarInformation;
import com.example.sayehwebservices.domain.CardPercentileReport;
import com.example.sayehwebservices.domain.EarningReport;
import com.example.sayehwebservices.domain.RareDeceasesInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeneralEconomicStatusResponse {
    List<CardPercentileReport> cardPercentileReports;
    List<CarInformation> carInformationList;
    List<EarningReport> earningReports;
    List<RareDeceasesInfo> rareDeceasesInfos;
}
